package com.example.bookstore.entity;

import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="requistions")
@DynamicUpdate
public class Requistion {
    @Id
    private int requistionId;
    @OneToOne
    private Book isbn;
    @ManyToOne
    private Publisher publisher;

    public Requistion() {
    }

    public int getRequistionId() {
        return requistionId;
    }

    public void setRequistionId(int requistionId) {
        this.requistionId = requistionId;
    }

    public Book getIsbn() {
        return isbn;
    }

    public void setIsbn(Book isbn) {
        this.isbn = isbn;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(com.example.bookstore.entity.Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Requistion that = (Requistion) o;
        return requistionId == that.requistionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(requistionId);
    }

    @Override
    public String toString() {
        return "Requistion{" +
                "requistionId=" + requistionId +
                ", isbn=" + isbn +
                ", publisher=" + publisher +
                '}';
    }
}
