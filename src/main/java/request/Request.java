package request;

public abstract class Request {
    private String serviceName;
    private String id;

    public String getServiceName() {
        return serviceName;
    }

    public String getId() {
        return id;
    }
}
