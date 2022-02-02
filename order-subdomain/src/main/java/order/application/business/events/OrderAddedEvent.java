package order.application.business.events;


import order.domain.Order;

public class OrderAddedEvent extends OrderEvent {
    private final Order order;

    public OrderAddedEvent(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

}
