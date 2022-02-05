package com.example.customermicroservice.config;


import customer.application.CustomerApplication;
import customer.application.business.StandardCustomerApplication;
import customer.infrastructure.CustomerEventPublisher;
import customer.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
    @Bean
    public CustomerApplication bookApp(CustomerRepository customerRepository,
                                       CustomerEventPublisher eventPublisher) {
        return new StandardCustomerApplication(customerRepository, eventPublisher);
    }

}
