package publisher.application.business;



import publisher.application.PublisherApplication;
import publisher.application.business.events.AddPublisher;
import publisher.domain.Publisher;
import publisher.infrastructure.PublisherEventPublisher;
import publisher.repository.PublisherRepository;

public class StandardPublisherApplication implements PublisherApplication {
    PublisherRepository publisherRepository;
    PublisherEventPublisher publisherEventPublisher;
    public StandardPublisherApplication(PublisherRepository publisherRepository,PublisherEventPublisher publisherEventPublisher) {
        this.publisherRepository = publisherRepository;
        this.publisherEventPublisher=publisherEventPublisher;
    }


    @Override
    public Publisher addPublisher(Publisher publisher) {
        Publisher addPublisher = publisherRepository.add(publisher);
        var event = new AddPublisher(addPublisher);
        publisherEventPublisher.publishEvent(event);
        return addPublisher;


    }
}
