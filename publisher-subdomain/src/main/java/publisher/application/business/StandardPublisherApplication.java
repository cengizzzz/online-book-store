package publisher.application.business;



import publisher.repository.PublisherRepository;

public class StandardPublisherApplication {
    PublisherRepository publisherRepository;

    public StandardPublisherApplication(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }


}
