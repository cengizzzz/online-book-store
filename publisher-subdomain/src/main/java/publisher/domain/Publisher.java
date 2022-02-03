package publisher.domain;

import java.util.Objects;

public class Publisher {
    private PublisherID publisherID;
    private PublisherName publisherName;
    private PublisherLogo publisherLogo;

    public Publisher(PublisherID publisherID, PublisherName publisherName, PublisherLogo publisherLogo) {
        this.publisherID = publisherID;
        this.publisherName = publisherName;
        this.publisherLogo = publisherLogo;
    }

    public static Publisher of(Publisher value) {
        return new Publisher(value.publisherID, value.publisherName, value.publisherLogo);
    }

    public PublisherID getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(PublisherID publisherID) {
        this.publisherID = publisherID;
    }

    public PublisherName getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(PublisherName publisherName) {
        this.publisherName = publisherName;
    }

    public PublisherLogo getPublisherLogo() {
        return publisherLogo;
    }

    public void setPublisherLogo(PublisherLogo publisherLogo) {
        this.publisherLogo = publisherLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return publisherID.equals(publisher.publisherID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherID);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherID=" + publisherID +
                ", publisherName=" + publisherName +
                ", publisherLogo=" + publisherLogo +
                '}';
    }
}
