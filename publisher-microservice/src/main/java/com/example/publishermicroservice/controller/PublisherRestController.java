package com.example.publishermicroservice.controller;

import com.example.bookstore.dto.request.AddBookRequest;
import com.example.bookstore.dto.response.AddBookResponse;
import com.example.publishermicroservice.service.PublisherService;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
@RequestMapping("publisher")
@CrossOrigin
@Validated
@Api( tags = "publisher")
public class PublisherRestController {
    private PublisherService publisherService;

    public PublisherRestController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    public AddPublisherResponse AddPub(
            @RequestBody @Validated AddPublisherRequest request){
        return bookStoreServis.AddPublisher(request);
    }
}
