package publisher.application.business.events;

import publisher.domain.Publisher;

public class DeletePublisher {
    private final Publisher publisher;

    public DeletePublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Publisher getBook() {
        return publisher;
    }
}
