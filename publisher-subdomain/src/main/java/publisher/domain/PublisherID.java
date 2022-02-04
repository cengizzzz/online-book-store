package publisher.domain;

import java.util.Objects;

public final class PublisherID {
    private final String publisherID;

    private PublisherID(String publisherID) {
        this.publisherID = publisherID;
    }

    public static PublisherID of(String value) {
        return new PublisherID(value);
    }

    public String getPublisherID() {
        return publisherID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublisherID that = (PublisherID) o;
        return Objects.equals(publisherID, that.publisherID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherID);
    }

    @Override
    public String toString() {
        return "PublisherID{" +
                "publisherID='" + publisherID + '\'' +
                '}';
    }
}
