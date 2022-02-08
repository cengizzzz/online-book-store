package publisher.application.business.events;

import publisher.domain.Publisher;

public class UpdatePublisher {
    private final Publisher publisher;

    public UpdatePublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Publisher getBook() {
        return publisher;
    }
}
