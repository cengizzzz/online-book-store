package order.application;

import customer.domain.Identity;
import order.domain.Order;
import order.domain.OrderId;

import java.util.Optional;

public interface OrderApplication {
    Order addOrder(Order order);
    Order updateOrder(Order order);
    Order cancelOrder(OrderId orderId);
    Optional<Order> findOrderByOrderId(OrderId orderId);
}
