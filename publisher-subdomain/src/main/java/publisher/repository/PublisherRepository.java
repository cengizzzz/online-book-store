package publisher.repository;


import publisher.domain.Publisher;
import publisher.domain.PublisherID;

import java.util.Optional;

public interface PublisherRepository {

    Publisher update(Publisher publisher);

    Publisher add(Publisher publisher);

    Optional<Publisher> delete(PublisherID publisherID);

    Optional<Publisher> findBookByIsbn(PublisherID publisherID);
}
