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
import publisher.domain.Publisher;
import publisher.domain.PublisherID;
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

    @Override
    public Publisher update(Publisher publisher) {
        return null;
    }

    @Override
    public Publisher add(Publisher publisher) {
        var document = mapper.map(publisher, com.example.publishermicroservice.entity.Publisher.class);
        return mapper.map(publisherJpaRepository.save(document), Publisher.class);
    }

    @Override
    public Optional<Publisher> delete(PublisherID publisherID) {
        return Optional.empty();
    }

    @Override
    public Optional<Publisher> findBookByIsbn(PublisherID publisherID) {
        return Optional.empty();
    }
}
