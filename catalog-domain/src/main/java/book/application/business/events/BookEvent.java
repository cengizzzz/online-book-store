package book.application.business.events;

import java.util.UUID;

public class BookEvent {
    private final String eventId;

    public BookEvent(String eventId) {
        this.eventId = eventId;
    }
    public BookEvent(){
        this.eventId= UUID.randomUUID().toString();
    }
    public String getEventId() {
        return eventId;
    }
}
