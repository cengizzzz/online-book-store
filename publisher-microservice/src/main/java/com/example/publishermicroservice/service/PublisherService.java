package com.example.publishermicroservice.service;

import com.example.bookstore.dto.request.AddBookRequest;
import com.example.publishermicroservice.dto.request.AddPublisherRequest;
import com.example.publishermicroservice.dto.response.AddPublisherResponse;

public interface PublisherService {
    AddPublisherResponse AddPublisher(AddPublisherRequest request);
}
