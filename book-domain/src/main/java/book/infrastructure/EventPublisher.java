package book.infrastructure;

import book.application.business.events.BookEvent;

public interface EventPublisher {
    void publishEvent(BookEvent businessEvent);
}