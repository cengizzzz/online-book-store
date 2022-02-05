package com.example.customermicroservice.adapter;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import customer.application.business.events.CustomerEvent;
import customer.infrastructure.CustomerEventPublisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class CustomerEventPublisherKafkaAdapter implements CustomerEventPublisher{

    private static final Logger logger =
            LoggerFactory.getLogger(CustomerEventPublisherKafkaAdapter.class);
    @Value("${book.events.topic}")
    private String bookTopicName;
    @Value("${customer.events.topic}")
    private String customerTopicName;
    @Value("${category.events.topic}")
    private String categoryTopicName;
    @Value("${stock.events.topic}")
    private String stockTopicName;
    @Value("${order.events.topic}")
    private String orderTopicName;
    @Value("${publisher.events.topic}")
    private String publisherTopicName;
    @Value("${requistion.events.topic}")
    private String orderTopicRequistion;
    @Value("${sale.events.topic}")
    private String saleTopicName;

    private KafkaTemplate<String, String> kafkaTemplate;
    private ObjectMapper mapper;

    public CustomerEventPublisherKafkaAdapter(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper mapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.mapper = mapper;
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
    /*
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

    @Override
    public void publishEvent(RequistionEvent businessEvent) {
        try {
            var eventAsJson = mapper.writeValueAsString(businessEvent);
            kafkaTemplate.send(orderTopicRequistion, eventAsJson);
        } catch (JsonProcessingException e) {
            logger.error("Error while converting the event to json: {}",
                    e.getMessage());
        }
    }

    @Override
    public void publishEvent(SaleEvent businessEvent) {
        try {
            var eventAsJson = mapper.writeValueAsString(businessEvent);
            kafkaTemplate.send(saleTopicName, eventAsJson);
        } catch (JsonProcessingException e) {
            logger.error("Error while converting the event to json: {}",
                    e.getMessage());
        }
    }
    */
}
