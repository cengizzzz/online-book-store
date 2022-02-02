package requistion.application.business.events;

import requistion.domain.Requistion;

import java.util.UUID;

public class RequistionEvent {
    private final String eventId;

    public RequistionEvent(Requistion eventId) {
        this.eventId = String.valueOf(eventId);
    }
    public RequistionEvent(){
        this.eventId= UUID.randomUUID().toString();
    }
    public String getEventId() {
        return eventId;
    }
}
