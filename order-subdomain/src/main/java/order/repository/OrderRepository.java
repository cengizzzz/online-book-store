package order.repository;

import order.domain.Order;
import order.domain.OrderId;

import java.util.Optional;

public interface OrderRepository {

    boolean existsByOrderId(OrderId orderId);

    Order addOrder(Order order);

    Order updateOrder(Order order);

    Optional<Order> cancelOrder(OrderId orderId);

    Optional<Order> findOrderByOrderId(OrderId orderId);
}
