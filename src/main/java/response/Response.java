package response;

public abstract class Response {
    private String responseToService;
    private String id;

    public String getResponseToService() {
        return responseToService;
    }

    public String getId() {
        return id;
    }
}
