package publisher.application.business;

import book.application.business.exception.BookNotFoundException;
import book.domain.Book;
import publisher.application.PublisherApplication;
import publisher.domain.Publisher;
import publisher.repository.PublisherRepository;

public class StandardPublisherApplication implements PublisherApplication {
    PublisherRepository publisherRepository;

    public StandardPublisherApplication(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Publisher addBook(Book book) {
        return null;
    }

    @Override
    public Publisher removeBook(Book book) {
        return null;
    }
}
