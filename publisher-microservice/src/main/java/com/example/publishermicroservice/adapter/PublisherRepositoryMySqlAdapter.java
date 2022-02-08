package com.example.publishermicroservice.adapter;

import book.domain.Book;
import book.domain.CategoryName;
import book.domain.Isbn;
import book.repository.BookRepository;
import com.example.bookstore.dto.response.GetBookResponse;
import com.example.bookstore.repository.BookJpaRepository;
import com.example.publishermicroservice.repository.PublisherJpaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import publisher.repository.PublisherRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class PublisherRepositoryMySqlAdapter implements PublisherRepository {

    private PublisherJpaRepository publisherJpaRepository;
    private ModelMapper mapper;

    public PublisherRepositoryMySqlAdapter(PublisherJpaRepository publisherJpaRepository, ModelMapper mapper) {
        this.publisherJpaRepository = publisherJpaRepository;
        this.mapper = mapper;
    }

}
