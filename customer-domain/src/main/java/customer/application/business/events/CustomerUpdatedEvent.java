package customer.application.business.events;

import customer.domain.Customer;

public class CustomerUpdatedEvent extends CustomerEvent{
    private final Customer customer;

    public CustomerUpdatedEvent(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
