package request;

public class UpdateRequest extends Request{
    private String key;
    private long timeStamp;
    private int count;

    public String getKey() {
        return key;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public int getCount() {
        return count;
    }
}
