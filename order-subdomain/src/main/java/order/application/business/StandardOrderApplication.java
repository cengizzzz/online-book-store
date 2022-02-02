package order.application.business;


import order.application.OrderApplication;
import order.application.business.events.OrderAddedEvent;
import order.application.business.events.OrderCanceledEvent;
import order.application.business.events.OrderUpdatedEvent;
import order.application.business.exception.ExistingOrderException;
import order.application.business.exception.OrderNotExistException;
import order.domain.Order;
import order.domain.OrderId;
import order.infrastructure.OrderEventPublisher;
import order.repository.OrderRepository;

import java.util.Optional;

public class StandardOrderApplication implements OrderApplication {
    private OrderRepository orderRepository;
    private OrderEventPublisher eventPublisher;

    @Override
    public Order addOrder(Order order) {
        var orderId = order.getOrderId();
        if (orderRepository.existsByOrderId(orderId))
            throw new ExistingOrderException("Order already exist", orderId.getValue());
        Order addedOrder = orderRepository.addOrder(order);
        var businessEvent = new OrderAddedEvent(addedOrder);
        eventPublisher.publishEvent(businessEvent);
        return addedOrder;
    }

    @Override
    public Order updateOrder(Order order) {
        var orderId = order.getOrderId();
        if (!orderRepository.existsByOrderId(orderId))
            throw new OrderNotExistException("Order does not exist", orderId.getValue());
        Order updatedOrder = orderRepository.updateOrder(order);
        var businessEvent = new OrderUpdatedEvent(updatedOrder);
        eventPublisher.publishEvent(businessEvent);
        return updatedOrder;
    }

    @Override
    public Order cancelOrder(OrderId orderId) {
        Optional<Order> canceledOrder = orderRepository.cancelOrder(orderId);
        var order=canceledOrder.orElseThrow(()->new OrderNotExistException(
                "Order does not exist", orderId.getValue()));
        eventPublisher.publishEvent(new OrderCanceledEvent(order));
        return order;
    }

    @Override
    public Optional<Order> findOrderByOrderId(OrderId orderId) {
        return orderRepository.findOrderByOrderId(orderId);
    }
}
