package book.application;

import book.domain.Book;
import book.domain.Isbn;

import java.util.Optional;

public interface BookApplication {
    Book addBook(Isbn isbn);
    Book deleBook(Isbn isbn);
    Optional<Book> findBookByIsbn(Isbn isbn);
    Book updateBook(Isbn isbn);
}
