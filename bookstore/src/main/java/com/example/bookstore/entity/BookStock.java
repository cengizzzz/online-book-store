package com.example.bookstore.entity;


import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="stocks")
@DynamicUpdate
public class BookStock {
    @Id
    private String isbn;
    private int copiesLeft;
    private int copiesSold;

    public BookStock() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCopiesLeft() {
        return copiesLeft;
    }

    public void setCopiesLeft(int copiesLeft) {
        this.copiesLeft = copiesLeft;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookStock bookStock = (BookStock) o;
        return isbn.equals(bookStock.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "BookStock{" +
                "isbn='" + isbn + '\'' +
                ", copiesLeft=" + copiesLeft +
                ", copiesSold=" + copiesSold +
                '}';
    }
}
