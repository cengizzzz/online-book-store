package com.example.publishermicroservice.controller;
import com.example.publishermicroservice.dto.request.AddPublisherRequest;
import com.example.publishermicroservice.dto.response.AddPublisherResponse;
import com.example.publishermicroservice.service.PublisherService;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping
    public AddPublisherResponse AddPub(@RequestBody @Validated AddPublisherRequest request){
        return publisherService.AddPublisher(request);
    }
}
