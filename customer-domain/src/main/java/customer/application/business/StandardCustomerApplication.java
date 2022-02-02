package customer.application.business;

import customer.application.CustomerApplication;
import customer.application.business.events.CustomerAddedEvent;
import customer.application.business.events.CustomerRemovedEvent;
import customer.application.business.events.CustomerUpdatedEvent;
import customer.application.business.exception.CustomerNotFoundException;
import customer.application.business.exception.ExistingCustomerException;
import customer.domain.Customer;
import customer.domain.Identity;
import customer.infrastructure.CustomerEventPublisher;
import customer.repository.CustomerRepository;

import java.util.Optional;

public class StandardCustomerApplication implements CustomerApplication {
    private CustomerRepository customerRepository;
    private CustomerEventPublisher eventPublisher;

    @Override
    public Customer addCustomer(Customer customer) {
        var customerIdentity = customer.getIdentity();
        if (customerRepository.existsByIdentity(customerIdentity))
            throw new ExistingCustomerException("Customer already exist", customerIdentity.getValue());
        Customer addedCustomer = customerRepository.add(customer);
        var businessEvent = new CustomerAddedEvent(addedCustomer);
        eventPublisher.publishEvent(businessEvent);
        return addedCustomer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        var customerIdentity = customer.getIdentity();
        if (!customerRepository.existsByIdentity(customerIdentity))
            throw new CustomerNotFoundException("Customer does not exist", customerIdentity.getValue());
        Customer updatedCustomer = customerRepository.update(customer);
        var businessEvent = new CustomerUpdatedEvent(updatedCustomer);
        eventPublisher.publishEvent(businessEvent);
        return updatedCustomer;
    }

    @Override
    public Customer removeCustomer(Identity identity) {
        Optional<Customer> removedCustomer = customerRepository.remove(identity);
        var customer=removedCustomer.orElseThrow(()->new CustomerNotFoundException(
                "Customer does not exist", identity.getValue()));
        eventPublisher.publishEvent(new CustomerRemovedEvent(customer));
        return customer;
    }

    @Override
    public Optional<Customer> findCustomerByIdentity(Identity identity) {
        return customerRepository.findOneById(identity);
    }
}