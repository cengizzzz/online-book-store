package publisher.application.business.exception;

public class ExistingPublisherException extends RuntimeException{
    private final String publisherID;

    public ExistingPublisherException(String message, String publisherID) {
        super(message);
        this.publisherID = publisherID;
    }

    public String getPublisherID() {
        return publisherID;
    }
}
