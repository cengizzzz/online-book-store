package customer.application;

import customer.domain.Customer;
import customer.domain.Identity;

import java.util.Optional;

public interface CustomerApplication {
    Customer addCustomer(Customer customer);

    Customer updateCustomer(Identity identity, Customer customer);

    Customer removeCustomer(Identity identity);
    Optional<Customer> findCustomerByIdentity(Identity identity);

}
