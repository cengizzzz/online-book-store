package publisher.infrastructure;

import publisher.application.business.events.PublisherEvent;

public interface PublisherEventPublisher {
    void publishEvent(PublisherEvent businessEvent);
}
