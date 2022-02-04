package order.domain;

import customer.domain.Customer;

import book.domain.Book;

import java.util.Objects;

public class Order {
    private OrderId orderId;
    private Book book;
    private Customer customer;

    public Order(OrderId orderId, Book book, Customer customer) {
        this.orderId = orderId;
        this.book = book;
        this.customer = customer;
    }
    public OrderId getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderId orderId) {
        this.orderId = orderId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", book=" + book +
                ", customer=" + customer +
                '}';
    }
    public static class Builder {
        private OrderId orderId;
        private Book book;
        private Customer customer;

        public Builder orderId(String value) {
            this.orderId = orderId.Of(value);
            return this;
        }
        public Builder book(Book value){
            this.book = Book.of(value);
            return this;
        }
        public Builder customer(Customer value){
            this.customer = Customer.of(value);
            return this;
        }

        public Order build() {
            var order = new Order(orderId, book, customer);
            return order;
        }
    }
}
