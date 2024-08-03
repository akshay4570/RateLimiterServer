package request;

public class UpdateConfigRequest extends Request{
    private String service;
    private String key;
    private String timeUnit;
    private int limit;

    public String getService() {
        return service;
    }

    public String getKey() {
        return key;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public int getLimit() {
        return limit;
    }
}
