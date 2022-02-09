package publisher.infrastructure;

import publisher.application.business.events.AddPublisher;

public interface PublisherEventPublisher {
    void publishEvent(AddPublisher businessEvent);

}
