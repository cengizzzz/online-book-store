package com.example.customermicroservice.service.business;

import com.example.customermicroservice.dto.request.AddCustomerRequest;
import com.example.customermicroservice.dto.request.UpdateCustomerRequest;
import com.example.customermicroservice.dto.response.AddCustomerResponse;
import com.example.customermicroservice.dto.response.DeleteCustomerResponse;
import com.example.customermicroservice.dto.response.GetCustomerResponse;
import com.example.customermicroservice.dto.response.UpdateCustomerResponse;
import com.example.customermicroservice.service.CustomerService;
import customer.application.CustomerApplication;
import customer.application.business.exception.CustomerNotFoundException;
import customer.domain.Identity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class StandardCustomerService implements CustomerService {

    private CustomerApplication customerApplication;
    private ModelMapper modelMapper;

    public StandardCustomerService(CustomerApplication customerApplication, ModelMapper modelMapper) {
        this.customerApplication = customerApplication;
        this.modelMapper = modelMapper;
    }

    @Override
    public GetCustomerResponse findCustomerByIdentity(String identity) {
        var customer = customerApplication.findCustomerByIdentity(Identity.of(identity));
        if (customer.isEmpty())
            throw new CustomerNotFoundException("Cannot find customer", identity);
        return modelMapper.map(customer.get(), GetCustomerResponse.class);
    }

    @Override
    public AddCustomerResponse addCustomer(AddCustomerRequest request) {
        return null;
    }

    @Override
    public UpdateCustomerResponse updateCustomer(UpdateCustomerRequest request) {
        return null;
    }

    @Override
    public DeleteCustomerResponse deleteCustomerByIdentity(String identity) {
        return null;
    }
}