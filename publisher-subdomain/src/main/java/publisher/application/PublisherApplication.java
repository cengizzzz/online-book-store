package publisher.application;

import book.domain.Book;
import publisher.domain.Publisher;


public interface PublisherApplication {
    Publisher addBook(Book book);
    Publisher removeBook(Book book);
}
