package publisher.application;

import publisher.domain.Publisher;
import publisher.domain.PublisherID;

import java.util.Optional;

public interface PublisherApplication {
    Publisher addPublisher(Publisher publisher);
}
