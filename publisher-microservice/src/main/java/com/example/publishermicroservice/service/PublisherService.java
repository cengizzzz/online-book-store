package com.example.publishermicroservice.service;

import com.example.bookstore.dto.request.AddBookRequest;

public interface PublisherService {
    AddPublisherResponse AddPublisher(AddPublisherRequest request);
}
