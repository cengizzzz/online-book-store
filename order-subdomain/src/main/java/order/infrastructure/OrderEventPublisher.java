package order.infrastructure;

import order.application.business.events.OrderEvent;

public interface OrderEventPublisher {
    void publishEvent(OrderEvent businessEvent);
}
