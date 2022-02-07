package com.example.customermicroservice.service;

import com.example.customermicroservice.dto.request.AddCustomerRequest;
import com.example.customermicroservice.dto.request.UpdateCustomerRequest;
import com.example.customermicroservice.dto.response.AddCustomerResponse;
import com.example.customermicroservice.dto.response.DeleteCustomerResponse;
import com.example.customermicroservice.dto.response.GetCustomerResponse;
import com.example.customermicroservice.dto.response.UpdateCustomerResponse;

public interface CustomerService {
    GetCustomerResponse findCustomerByIdentity(String identity);
    AddCustomerResponse addCustomer(AddCustomerRequest request);
    UpdateCustomerResponse updateCustomer(String identity,UpdateCustomerRequest request);
    DeleteCustomerResponse deleteCustomerByIdentity(String identity);
}
