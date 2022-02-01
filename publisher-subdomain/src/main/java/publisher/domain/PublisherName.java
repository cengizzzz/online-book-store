package publisher.domain;

import java.util.Objects;

public final class PublisherName {
    private final String publisherName;

    public PublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublisherName that = (PublisherName) o;
        return publisherName.equals(that.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherName);
    }

    @Override
    public String toString() {
        return "PublisherName{" +
                "publisherName='" + publisherName + '\'' +
                '}';
    }
}
