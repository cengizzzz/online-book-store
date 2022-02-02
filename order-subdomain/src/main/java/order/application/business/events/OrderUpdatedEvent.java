package order.application.business.events;

import order.domain.Order;

public class OrderUpdatedEvent extends OrderEvent{
    private final Order order;

    public OrderUpdatedEvent(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
