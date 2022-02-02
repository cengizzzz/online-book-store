package customer.application.business.events;

import customer.domain.Customer;

public class CustomerRemovedEvent extends CustomerEvent{
    private final Customer customer;

    public CustomerRemovedEvent(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
