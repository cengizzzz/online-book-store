package publisher.domain;

import java.util.Objects;

public final class PublisherLogo {
    private final byte[] publisherLogo;

    public PublisherLogo(byte[] publisherLogo) {
        this.publisherLogo = publisherLogo;
    }

    public byte[] getPublisherLogo() {
        return publisherLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublisherLogo that = (PublisherLogo) o;
        return publisherLogo.equals(that.publisherLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherLogo);
    }

}
