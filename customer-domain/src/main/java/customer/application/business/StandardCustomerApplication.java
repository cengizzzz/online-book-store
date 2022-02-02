package customer.application.business;

import customer.application.CustomerApplication;
import customer.domain.Customer;
import customer.domain.Identity;
import customer.repository.CustomerRepository;

import java.util.Optional;

public class StandardCustomerApplication implements CustomerApplication {
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer removeCustomer(Identity identity) {
        return null;
    }

    @Override
    public Optional<Customer> findCustomerByIdentity(Identity identity) {
        return Optional.empty();
    }
}
