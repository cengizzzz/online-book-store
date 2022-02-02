package category.infrastructure;

import category.application.business.events.CategoryEvent;

public interface EventPublisher {
    void publishEvent(CategoryEvent businessEvent);
}
