package publisher.repository;

import book.domain.Book;
import book.domain.Isbn;

public interface PublisherRepository {
    boolean existByIsbn(Isbn isbn);

    Book save(Book book);

}
