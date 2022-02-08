package publisher.application;

import publisher.domain.Publisher;
import publisher.domain.PublisherID;

import java.util.Optional;

public interface PublisherApplication {
    Publisher addPublisher(Publisher publisher);
    Publisher deletePublisher(PublisherID id);
    Optional<Publisher> findPublisherById(PublisherID publisherID);
    Publisher updateBook(Publisher publisher);
}
