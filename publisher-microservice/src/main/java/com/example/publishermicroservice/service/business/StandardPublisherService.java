package com.example.publishermicroservice.service.business;

import com.example.publishermicroservice.dto.request.AddPublisherRequest;
import com.example.publishermicroservice.dto.response.AddPublisherResponse;
import com.example.publishermicroservice.entity.Publisher;
import com.example.publishermicroservice.repository.PublisherJpaRepository;
import com.example.publishermicroservice.service.PublisherService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import publisher.application.PublisherApplication;
import publisher.infrastructure.PublisherEventPublisher;
import publisher.repository.PublisherRepository;

@Service
public class StandardPublisherService implements PublisherService{
    private PublisherJpaRepository publisherJpaRepository;
    private PublisherApplication publisherApplication;
    private PublisherRepository publisherRepository;
    private PublisherEventPublisher publisherEventPublisher;
    private ModelMapper modelMapper;

    public StandardPublisherService(PublisherJpaRepository publisherJpaRepository,ModelMapper modelMapper,PublisherRepository publisherRepository, PublisherEventPublisher publisherEventPublisher) {
        this.publisherRepository = publisherRepository;
        this.publisherEventPublisher = publisherEventPublisher;
        this.modelMapper=modelMapper;
        this.publisherJpaRepository=publisherJpaRepository;
    }

    @Override
    public AddPublisherResponse AddPublisher(AddPublisherRequest request) {
        var pub = modelMapper.map(request, Publisher.class);
        return modelMapper.map(publisherJpaRepository.save(pub),
                AddPublisherResponse.class);
    }

}
