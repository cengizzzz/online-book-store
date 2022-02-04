package publisher.application.business.exception;

public class PublisherNotFoundException extends RuntimeException{
    private final String publisherID;

    public PublisherNotFoundException(String message, String publisherID) {
        super(message);
        this.publisherID = publisherID;
    }

    public String getPublisherID() {
        return publisherID;
    }
}
