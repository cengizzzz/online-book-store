package customer.infrastructure;

import customer.application.business.events.CustomerEvent;

public interface EventPublisher {
    void publishEvent(CustomerEvent businessEvent);
}
