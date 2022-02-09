package com.example.bookstore.config;

import book.application.BookApplication;
import book.application.business.StandartBookApplication;
import book.infrastructure.EventPublisher;
import book.repository.BookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
    @Bean
    public BookApplication bookApp(BookRepository bookRepository,
                                   EventPublisher eventPublisher) {
        return new StandartBookApplication(bookRepository, eventPublisher);
    }
}
