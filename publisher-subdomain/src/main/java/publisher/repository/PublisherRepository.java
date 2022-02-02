package publisher.repository;

import book.domain.Isbn;

public interface PublisherRepository {
    boolean existByIsbn(Isbn isbn);

}
