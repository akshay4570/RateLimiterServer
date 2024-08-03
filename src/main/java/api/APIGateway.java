package api;

import controller.RateLimiterController;
import controller.ServiceConfigController;
import request.ReadConfigRequest;
import request.ReadRequest;
import request.UpdateConfigRequest;
import request.UpdateRequest;
import response.Response;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class APIGateway {

    private RateLimiterController rateLimiterController;
    private ServiceConfigController serviceConfigController;
    private ExecutorService executorService = Executors.newFixedThreadPool(10);
    private ResponseWriter responseWriter;

    public void updateKey(String json){
        CompletableFuture.supplyAsync(() -> rateLimiterController.updateKeyMetrics(toObject(json, UpdateRequest.class)), executorService)
                .thenCompose(future -> future.thenAccept(response -> responseWriter.returnRepsonse(response)));
    }

    public void readKey(String json){
        CompletableFuture.supplyAsync(() -> rateLimiterController.readKeyMetrics(toObject(json, ReadRequest.class)), executorService)
                .thenCompose(future -> future.thenAccept(response -> responseWriter.returnRepsonse(response)));
    }

    public void updateServiceConfig(String json){
        CompletableFuture.supplyAsync(() -> serviceConfigController.updateLimit(toObject(json, UpdateConfigRequest.class)), executorService)
                .thenCompose(future -> future.thenAccept(response -> responseWriter.returnRepsonse(response)));
    }

    public void readServiceConfig(String json){
        CompletableFuture.supplyAsync(() -> serviceConfigController.readLimit(toObject(json, ReadConfigRequest.class)), executorService)
                .thenCompose(future -> future.thenAccept(response -> responseWriter.returnRepsonse(response)));
    }

    private <T> T toObject(String json, Class<T> clazz) {
        return null;
    }
}

class ResponseWriter{
    public void returnRepsonse(Response response){

    }
}
