package com.example.customermicroservice.service.business;
import com.example.customermicroservice.dto.request.AddCustomerRequest;
import com.example.customermicroservice.dto.request.UpdateCustomerRequest;
import com.example.customermicroservice.dto.response.AddCustomerResponse;
import com.example.customermicroservice.dto.response.DeleteCustomerResponse;
import com.example.customermicroservice.dto.response.GetCustomerResponse;
import com.example.customermicroservice.dto.response.UpdateCustomerResponse;
import com.example.customermicroservice.entity.Customer;
import com.example.customermicroservice.repository.CustomerJpaRepository;
import com.example.customermicroservice.service.CustomerService;
import customer.application.CustomerApplication;
import customer.application.business.exception.CustomerNotFoundException;
import customer.domain.Identity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StandardCustomerService implements CustomerService {

    private CustomerApplication customerApplication;
    private ModelMapper modelMapper;
    private CustomerJpaRepository customerJpaRepository;

    public StandardCustomerService(CustomerApplication customerApplication,ModelMapper modelMapper, CustomerJpaRepository customerJpaRepository) {
        this.customerApplication = customerApplication;
        this.modelMapper = modelMapper;
        this.customerJpaRepository=customerJpaRepository;
    }

    @Override
    public GetCustomerResponse findCustomerByIdentity(String identity) {
        /*
        var customer = customerApplication.findCustomerByIdentity(Identity.of(identity));
        if (customer.isEmpty())
            throw new CustomerNotFoundException("Cannot find customer", identity);
        return modelMapper.map(customer.get(), GetCustomerResponse.class);
         */
        return null;
    }

    @Override
    public AddCustomerResponse addCustomer(AddCustomerRequest request) {

        var customer = modelMapper.map(request, Customer.class);
        return modelMapper.map(customerJpaRepository.save(customer),
                AddCustomerResponse.class);
        /*
        var customer = modelMapper.map(request, Customer.class);
        var addedCustomer = customerApplication.addCustomer(customer);
        return modelMapper.map(addedCustomer, AddCustomerResponse.class);
        */
        //return null;
    }

    @Override
    public UpdateCustomerResponse updateCustomer(String identity, UpdateCustomerRequest request) {
        return null;
    }

    @Override
    public DeleteCustomerResponse deleteCustomerByIdentity(String identity) {
        /*
        var customer =	customerApplication.removeCustomer(Identity.of(identity));
        return modelMapper.map(customer,DeleteCustomerResponse.class);
         */
        return null;
    }
}
