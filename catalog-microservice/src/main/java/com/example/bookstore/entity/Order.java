package com.example.bookstore.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@DynamicUpdate
@Table(name = "order")
public class Order {
    @Id
    private String orderID;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Book book;

    public Order() {
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return getOrderID().equals(order.getOrderID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderID());
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", customer=" + customer +
                ", book=" + book +
                '}';
    }
}
