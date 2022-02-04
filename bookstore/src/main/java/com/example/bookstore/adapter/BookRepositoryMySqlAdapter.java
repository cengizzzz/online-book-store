package com.example.bookstore.adapter;

import book.domain.Book;
import book.domain.Isbn;
import book.repository.BookRepository;
import com.example.bookstore.repository.BookJpaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BookRepositoryMySqlAdapter implements BookRepository {

    private BookJpaRepository bookJpaRepository;
    private ModelMapper mapper;

    public BookRepositoryMySqlAdapter(BookJpaRepository bookJpaRepository, ModelMapper mapper) {
        this.bookJpaRepository = bookJpaRepository;
        this.mapper = mapper;
    }

    @Override
    public boolean existsByIsbn(Isbn isbn) {
        //return bookJpaRepository.existsById(isbn.getValue());
        return false;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public Book add(Book book) {
        /*
        var document = mapper.map(book, com.example.bookstore.entity.Book.class);
        return mapper.map(bookJpaRepository.save(document),Book.class);
         */
        return null;
    }

    @Override
    public Optional<Book> delete(Isbn isbn) {
        /*
        var document = bookJpaRepository.findById(isbn.getValue());
        document.ifPresent( bookJpaRepository::delete);
        return document.map(doc -> mapper.map(doc, Book.class));
         */
        return Optional.empty();
    }

    @Override
    public Optional<Book> findBookByIsbn(Isbn isbn) {
        /*
        return bookJpaRepository.findById(isbn.getValue())
                .map(doc -> mapper.map(doc, Book.class));
         */
        return Optional.empty();
    }
}
