package customer.infrastructure;

import customer.application.business.events.CustomerEvent;

public interface CustomerEventPublisher {
    void publishEvent(CustomerEvent businessEvent);
}
