package book.application.business;

import book.application.BookApplication;
import book.domain.Book;
import book.domain.Isbn;

import java.util.Optional;

public class StandartBookApplication implements BookApplication {
    @Override
    public Book addBook(Isbn isbn) {
        return null;
    }

    @Override
    public Book deleBook(Isbn isbn) {
        return null;
    }

    @Override
    public Optional<Book> findBookByIsbn(Isbn isbn) {
        return Optional.empty();
    }

    @Override
    public Book updateBook(Isbn isbn) {
        return null;
    }
}
