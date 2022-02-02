package publisher.application.business;

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
        var isbn = book.getIsbn();
        if(publisherRepository.existByIsbn(isbn))
        return null;
        return null;
    }

    @Override
    public Publisher removeBook(Book book) {
        return null;
    }
}
