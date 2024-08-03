package controller;

import dao.RateLimiterDAO;
import request.ReadRequest;
import request.UpdateRequest;
import response.ReadResponse;
import response.UpdateResponse;

import java.util.concurrent.CompletableFuture;

public class RateLimiterController {

    private RateLimiterDAO rateLimiterDAO;

    public CompletableFuture<UpdateResponse> updateKeyMetrics(UpdateRequest request){
        return rateLimiterDAO.updateLimit(request.getServiceName(), request.getKey(), request.getCount(), request.getTimeStamp())
                .thenApply(__ -> new UpdateResponse());
    }

    public CompletableFuture<ReadResponse> readKeyMetrics(ReadRequest request){
        return rateLimiterDAO.readLimit(request.getServiceName());
    }
}
