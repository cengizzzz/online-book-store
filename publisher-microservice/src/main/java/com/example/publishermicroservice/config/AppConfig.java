package com.example.publishermicroservice.config;
import book.application.business.StandartBookApplication;
import com.example.publishermicroservice.service.business.StandardPublisherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import publisher.application.PublisherApplication;
import publisher.application.business.StandardPublisherApplication;
import publisher.infrastructure.PublisherEventPublisher;
import publisher.repository.PublisherRepository;

@Configuration
public class AppConfig {

    @Bean
    public PublisherApplication publisherApp(PublisherRepository publisherRepository,
                                             PublisherEventPublisher publisherEventPublisher) {
       return new StandardPublisherApplication(publisherRepository,publisherEventPublisher);
    }
}
