package com.example.publishermicroservice.adapter;

import com.example.bookstore.adapter.EventBookKafkaAdapter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import publisher.application.business.events.AddPublisher;
import publisher.infrastructure.PublisherEventPublisher;

@Service
public class EventPublisherKafkaAdapter implements PublisherEventPublisher {
    private static final Logger logger =
            LoggerFactory.getLogger(EventBookKafkaAdapter.class);
    @Value("${publisher.events.topic}")
    private String publisherTopicName;

    private KafkaTemplate<String, String> kafkaTemplate;
    private ObjectMapper mapper;

    public EventPublisherKafkaAdapter(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper mapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.mapper = mapper;
    }

    @Override
    public void publishEvent(AddPublisher businessEvent) {
        try {
            var eventAsJson = mapper.writeValueAsString(businessEvent);
            kafkaTemplate.send(publisherTopicName, eventAsJson);
        } catch (JsonProcessingException e) {
            logger.error("Error while converting the event to json: {}",
                    e.getMessage());
        }

    }
}
