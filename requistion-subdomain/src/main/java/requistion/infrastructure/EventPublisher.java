package requistion.infrastructure;


import requistion.application.business.events.RequistionAdd;
import requistion.application.business.events.RequistionDel;
import requistion.application.business.events.RequistionEvent;

public interface EventPublisher {
    void publishEvent(RequistionDel businessEvent);
    void publishEvent(RequistionAdd businessEvent);
}
