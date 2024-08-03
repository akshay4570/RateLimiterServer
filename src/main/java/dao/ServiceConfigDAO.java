package dao;

import models.ServiceConfiguration;

import java.util.concurrent.CompletableFuture;

public class ServiceConfigDAO {

    public CompletableFuture<Void> updateServiceConfig(ServiceConfiguration serviceConfiguration){
        //Update the Configuration of the Service in DB
        return null;
    }

    public CompletableFuture<ServiceConfiguration> readConfig(String serviceName){
        //Read Config from the Service Details
        return null;
    }
}
