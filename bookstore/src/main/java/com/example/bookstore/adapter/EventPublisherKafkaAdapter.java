package com.example.bookstore.adapter;

import application.business.event.StockEvent;
import application.insfrastructure.StockEventPublisher;
import book.application.business.events.BookEvent;
import book.infrastructure.EventPublisher;
import category.application.business.events.CategoryEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
<<<<<<<<< Temporary merge branch 1
import customer.application.business.events.CustomerEvent;
import customer.infrastructure.CustomerEventPublisher;
import order.application.business.events.OrderEvent;
import order.infrastructure.OrderEventPublisher;
=========
import customer.infrastructure.CustomerEventPublisher;

>>>>>>>>> Temporary merge branch 2
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

<<<<<<<<< Temporary merge branch 1
public class EventPublisherKafkaAdapter extends CustomerEvent implements category.infrastructure.EventPublisher, EventPublisher, CustomerEventPublisher, StockEventPublisher, OrderEventPublisher{
=========

public class EventPublisherKafkaAdapter implements EventPublisher {
>>>>>>>>> Temporary merge branch 2
    private static final Logger logger =
            LoggerFactory.getLogger(EventPublisherKafkaAdapter.class);
    @Value("${book.events.topic}")
    private String bookTopicName;
    private String customerTopicName;
    private String categoryTopicName;
    private String stockTopicName;
    private String orderTopicName;
    //private String publisherTopicName;
    private String requistion;


    private KafkaTemplate<String, String> kafkaTemplate;
    private ObjectMapper mapper;

    public EventPublisherKafkaAdapter(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper mapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.mapper = mapper;
    }
    @Override
    public void publishEvent(BookEvent businessEvent) {
        try {
            var eventAsJson = mapper.writeValueAsString(businessEvent);
            kafkaTemplate.send(bookTopicName, eventAsJson);
        } catch (JsonProcessingException e) {
            logger.error("Error while converting the event to json: {}",
                    e.getMessage());
        }
    }

    @Override
    public void publishEvent(CategoryEvent businessEvent) {

    }

    @Override
    public void publishEvent(CustomerEvent businessEvent) {

    }

    @Override
    public void stockPublishEvent(StockEvent businessEvent) {

    }

    @Override
    public void publishEvent(OrderEvent businessEvent) {

    }
}
