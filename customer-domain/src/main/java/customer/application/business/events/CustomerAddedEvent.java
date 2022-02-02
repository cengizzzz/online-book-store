package customer.application.business.events;

import customer.domain.Customer;

public class CustomerAddedEvent extends CustomerEvent {
    private final Customer customer;

    public CustomerAddedEvent(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
