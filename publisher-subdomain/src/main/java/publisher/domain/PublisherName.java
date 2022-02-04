package publisher.domain;

import java.util.Objects;

public final class PublisherName {
    private final String publisherName;

    private PublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public static PublisherName of(String value) {
        return new PublisherName(value);
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
