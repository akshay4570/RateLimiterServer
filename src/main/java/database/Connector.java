package database;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Connector {

    public CompletableFuture<Void> updateDB(String sql){
        //update the DB
        return null;
    }

    public <T> List<T> readFromDB(String sql, Class<T> clazz){
        //read the DB
        return null;
    }
}
