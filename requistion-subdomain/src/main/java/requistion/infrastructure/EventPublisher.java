package requistion.infrastructure;

import requistion.application.business.events.RequistionEvent;

public interface EventPublisher {
    void publishEvent(RequistionEvent businessEvent);
}
