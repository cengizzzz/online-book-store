package com.example.bookstore.adapter;

import application.business.event.StockEvent;
import application.insfrastructure.StockEventPublisher;
import book.application.business.events.BookEvent;
import book.infrastructure.EventPublisher;
import category.application.business.events.CategoryEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import customer.application.business.events.CustomerEvent;
import customer.infrastructure.CustomerEventPublisher;
import order.application.business.events.OrderEvent;
import order.infrastructure.OrderEventPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class EventPublisherKafkaAdapter implements
        category.infrastructure.EventPublisher, EventPublisher,
        CustomerEventPublisher, StockEventPublisher, OrderEventPublisher {
    private static final Logger logger =
            LoggerFactory.getLogger(EventPublisherKafkaAdapter.class);
    @Value("${book.events.topic}")
    private String bookTopicName;
    @Value("${customer.events.topic}")
    private String customerTopicName;
    private String categoryTopicName;
    private String stockTopicName;
    private String orderTopicName;
    //private String publisherTopicName;
    //private String requistion;
    //private String saleTopicName;

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
        try {
            var eventAsJson = mapper.writeValueAsString(businessEvent);
            kafkaTemplate.send(categoryTopicName, eventAsJson);
        } catch (JsonProcessingException e) {
            logger.error("Error while converting the event to json: {}",
                    e.getMessage());
        }
    }

    @Override
    public void publishEvent(CustomerEvent businessEvent) {
        try {
            var eventAsJson = mapper.writeValueAsString(businessEvent);
            kafkaTemplate.send(customerTopicName, eventAsJson);
        } catch (JsonProcessingException e) {
            logger.error("Error while converting the event to json: {}",
                    e.getMessage());
        }
    }

    @Override
    public void stockPublishEvent(StockEvent businessEvent) {
        try {
            var eventAsJson = mapper.writeValueAsString(businessEvent);
            kafkaTemplate.send(stockTopicName, eventAsJson);
        } catch (JsonProcessingException e) {
            logger.error("Error while converting the event to json: {}",
                    e.getMessage());
        }
    }

    @Override
    public void publishEvent(OrderEvent businessEvent) {
        try {
            var eventAsJson = mapper.writeValueAsString(businessEvent);
            kafkaTemplate.send(orderTopicName, eventAsJson);
        } catch (JsonProcessingException e) {
            logger.error("Error while converting the event to json: {}",
                    e.getMessage());
        }
    }
}
