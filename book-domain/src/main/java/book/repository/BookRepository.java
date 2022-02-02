package book.repository;

import book.domain.Book;
import book.domain.Isbn;

import java.util.Optional;

public interface BookRepository {
    boolean existsByIsbn(Isbn isbn);

    Book update(Book book);

    Book add(Book book);

    Optional<Book> delete(Isbn isbn);

    Optional<Book> findBookByIsbn(Isbn isbn);

}
