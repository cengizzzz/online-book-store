package com.example.bookstore.adapter;

import book.domain.Book;
import book.domain.Isbn;
import book.repository.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BookRepositoryMySqlAdapter implements BookRepository {
    @Override
    public boolean existsByIsbn(Isbn isbn) {
        return false;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public Book add(Book book) {
        return null;
    }

    @Override
    public Optional<Book> delete(Isbn isbn) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> findBookByIsbn(Isbn isbn) {
        return Optional.empty();
    }
}
