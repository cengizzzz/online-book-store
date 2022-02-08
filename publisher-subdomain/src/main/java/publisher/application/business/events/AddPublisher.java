package publisher.application.business.events;

import publisher.domain.Publisher;

public class AddPublisher {
    private final Publisher publisher;

    public AddPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Publisher getBook() {
        return publisher;
    }
}
