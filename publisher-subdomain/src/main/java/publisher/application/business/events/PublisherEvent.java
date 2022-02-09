package publisher.application.business.events;

import publisher.domain.Publisher;

import java.util.UUID;

public class PublisherEvent {
    private final String eventId;

    public PublisherEvent(String eventId) {
        this.eventId = eventId;
    }
    public PublisherEvent(){
        this.eventId= UUID.randomUUID().toString();
    }
    public String getEventId() {
        return eventId;
    }
}
