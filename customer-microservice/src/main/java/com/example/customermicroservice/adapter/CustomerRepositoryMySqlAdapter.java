package com.example.customermicroservice.adapter;


import com.example.customermicroservice.repository.CustomerJpaRepository;
import customer.domain.Customer;
import customer.domain.Identity;
import customer.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepositoryMySqlAdapter implements CustomerRepository {

    private CustomerJpaRepository customerJpaRepository;
    private ModelMapper mapper;

    public CustomerRepositoryMySqlAdapter(CustomerJpaRepository customerJpaRepository,ModelMapper mapper) {
        this.customerJpaRepository = customerJpaRepository;
        this.mapper = mapper;
    }

    @Override
    public boolean existsByIdentity(Identity identity) {
        System.err.println(identity.getValue());
        return customerJpaRepository.existsById(identity.getValue());
    }

    @Override
    public Customer add(Customer customer) {
        //var document=com.example.customermicroservice.entity.Customer.class;
       // var a1= new com.example.customermicroservice.entity.Customer();
        var document = mapper.map(customer, com.example.customermicroservice.entity.Customer.class);
        return mapper.map(customerJpaRepository.save(document),Customer.class);
        //return null;
    }


    @Override
    public Customer update(Identity identity, Customer customer) {
        /*
        var documentOld = customerJpaRepository.findById(identity.getValue());
        documentOld.ifPresent( customerJpaRepository::delete);

        var documentNew = mapper.map(customer, com.example.customermicroservice.entity.Customer.class);
        return mapper.map(customerJpaRepository.save(documentNew),Customer.class);
         */
        return null;
    }

    @Override
    public Optional<Customer> remove(Identity identity) {
        /*
        var document = customerJpaRepository.findById(identity.getValue());
        document.ifPresent( customerJpaRepository::delete);
        return document.map(doc -> mapper.map(doc, Customer.class));
         */
        return null;
    }

    @Override
    public Optional<Customer> findOneById(Identity identity) {
        /*
        return customerJpaRepository.findById(identity.getValue())
                .map(doc -> mapper.map(doc, Customer.class));
        */
        return null;
    }
}
