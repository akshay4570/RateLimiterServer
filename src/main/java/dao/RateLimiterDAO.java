package dao;

import response.ReadResponse;

import java.util.concurrent.CompletableFuture;

public class RateLimiterDAO {

    public CompletableFuture<Void> updateLimit(String serviceName, String key, int count, long timeStamp){
        //initialize Connectors to DB and update the Limit
        return null;
    }

    public CompletableFuture<ReadResponse> readLimit(String serviceName){
        //initialize Connectors to DB and read the Limit
        return null;
    }
}
