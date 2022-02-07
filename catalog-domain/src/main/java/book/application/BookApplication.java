package book.application;

import book.domain.Book;
import book.domain.Isbn;
import category.domain.Category;

import java.util.Optional;

public interface BookApplication {
    Book addBook(Book book);
    Book deleBook(Isbn isbn);
    Optional<Book> findBookByIsbn(Isbn isbn);
    Book updateBook(Book book);
    Book FindByCategory(Book categoryName);

}