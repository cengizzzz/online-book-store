package com.example.customermicroservice.adapter;


import com.example.customermicroservice.repository.CustomerJpaRepository;
import customer.domain.Customer;
import customer.domain.Identity;
import customer.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerRepositoryMySqlAdapter implements CustomerRepository {

    private CustomerJpaRepository customerJpaRepository;
    private ModelMapper mapper;

    public CustomerRepositoryMySqlAdapter(CustomerJpaRepository customerJpaRepository, ModelMapper mapper) {
        this.customerJpaRepository = customerJpaRepository;
        this.mapper = mapper;
    }

    @Override
    public boolean existsByIdentity(Identity identity) {
        return customerJpaRepository.existsById(identity.getValue());
    }

    @Override
    public Customer add(Customer customer) {
        /*
        var document = mapper.map(customer, com.example.customermicroservice.entity.Customer.class);
        return mapper.map(customerJpaRepository.save(document),Customer.class);
        */
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Optional<Customer> remove(Identity identity) {
        /*
        var document = customerJpaRepository.findById(identity.getValue());
        document.ifPresent( customerJpaRepository::delete);
        return document.map(doc -> mapper.map(doc, Customer.class));
        */
        return Optional.empty();
    }

    @Override
    public Optional<Customer> findOneById(Identity identity) {
        /*
        return customerJpaRepository.findById(identity.getValue())
                .map(doc -> mapper.map(doc, Customer.class));
        */
        return Optional.empty();
    }
}
