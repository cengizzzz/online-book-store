package com.example.bookstore.dto.response;

import java.util.Objects;

public class UpdateBookResponse {
    private String isbn;
    private String title;

    public UpdateBookResponse(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateBookResponse that = (UpdateBookResponse) o;
        return getIsbn().equals(that.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn());
    }

    @Override
    public String toString() {
        return "UpdateBookResponse{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
