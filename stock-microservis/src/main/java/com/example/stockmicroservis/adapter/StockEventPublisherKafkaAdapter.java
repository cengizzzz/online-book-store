package com.example.stockmicroservis.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import stock.application.business.event.StockEvent;
import stock.insfrastructure.StockEventPublisher;

@Service
public class StockEventPublisherKafkaAdapter implements StockEventPublisher {
    private static Logger logger = LoggerFactory.getLogger(StockEventPublisherKafkaAdapter.class);

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
    @Value("${stock.event.topic}")
    private String topicName;
    private KafkaTemplate<String,String> kafkaTemplate;
    private ObjectMapper mapper;

    public StockEventPublisherKafkaAdapter(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper mapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.mapper = mapper;

    }
    @Override
    public void stockPublishEvent (StockEvent businessEvent){
        try {
            var eventAsJson = mapper.writeValueAsString(businessEvent);
            kafkaTemplate.send(topicName, eventAsJson);
        }
        catch (JsonProcessingException e) {
            logger.error("Error while converting the event to json: {}", e.getMessage());
        }
    }


}
