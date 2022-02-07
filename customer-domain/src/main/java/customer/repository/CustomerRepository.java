package customer.repository;

import customer.domain.Customer;
import customer.domain.Identity;

import java.util.Optional;

public interface CustomerRepository {
    boolean existsByIdentity(Identity identity);

    Customer add(Customer customer);

    Customer update(Identity identity, Customer customer);

    Optional<Customer> remove(Identity identity);

    Optional<Customer> findOneById(Identity identity);
}
