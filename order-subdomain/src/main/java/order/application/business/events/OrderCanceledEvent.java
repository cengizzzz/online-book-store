package order.application.business.events;

import order.domain.Order;

public class OrderCanceledEvent extends OrderEvent{
    private final Order order;

    public OrderCanceledEvent(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
