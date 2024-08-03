package models;

import java.util.concurrent.TimeUnit;

public class ServiceConfiguration {

    private String service;
    private String key;
    private TimeUnit timeUnit;
    private int limit;

    public ServiceConfiguration(String service, String key, TimeUnit timeUnit, int limit) {
        this.service = service;
        this.key = key;
        this.timeUnit = timeUnit;
        this.limit = limit;
    }
}
