package controller;

import dao.ServiceConfigDAO;
import models.ServiceConfiguration;
import request.ReadConfigRequest;
import request.UpdateConfigRequest;
import response.ReadConfigResponse;
import response.UpdateConfigResponse;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ServiceConfigController {

    private ServiceConfigDAO serviceConfigDAO;

    public CompletableFuture<UpdateConfigResponse> updateLimit(UpdateConfigRequest updateConfigRequest){
        return serviceConfigDAO.updateServiceConfig(
                new ServiceConfiguration(updateConfigRequest.getService(),
                        updateConfigRequest.getKey(),
                        TimeUnit.valueOf(updateConfigRequest.getTimeUnit()),
                        updateConfigRequest.getLimit()))
                .thenApply(__ -> new UpdateConfigResponse());
    }

    public CompletableFuture<ReadConfigResponse> readLimit(ReadConfigRequest readConfigRequest){
        return serviceConfigDAO.readConfig(readConfigRequest.getServiceName())
                .thenApply(configuration -> new ReadConfigResponse(configuration));
    }
}
