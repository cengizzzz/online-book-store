package com.example.customermicroservice.controller;

import com.example.customermicroservice.dto.request.AddCustomerRequest;
import com.example.customermicroservice.dto.request.UpdateCustomerRequest;
import com.example.customermicroservice.dto.response.AddCustomerResponse;
import com.example.customermicroservice.dto.response.DeleteCustomerResponse;
import com.example.customermicroservice.dto.response.GetCustomerResponse;
import com.example.customermicroservice.dto.response.UpdateCustomerResponse;
import com.example.customermicroservice.service.CustomerService;
import com.example.customermicroservice.validation.TcKimlikNo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
@RequestMapping("customers")
@CrossOrigin
@Validated
@Api( tags = "Customers")
public class CustomerRestController {

    private CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("{identity}")
    @ApiOperation(value = "This method is used to get the customer for the given {identity}")
    public GetCustomerResponse getCustomerByIdentity(@PathVariable @TcKimlikNo String identity){
        return customerService.findCustomerByIdentity(identity);
    }

    @PostMapping
    public AddCustomerResponse addCustomerResponse(
            @RequestBody @Validated AddCustomerRequest request){
                return customerService.addCustomer(request);

    }
    @DeleteMapping("identity")
    public DeleteCustomerResponse deleteCustomerResponse(@PathVariable @TcKimlikNo  String identity){
        return customerService.deleteCustomerByIdentity(identity);
    }
    @PutMapping("identity")
    public UpdateCustomerResponse updateCustomerResponse(@PathVariable @TcKimlikNo String identity,@RequestBody @Validated UpdateCustomerRequest request){
        return customerService.updateCustomer(identity,request);
    }
}
