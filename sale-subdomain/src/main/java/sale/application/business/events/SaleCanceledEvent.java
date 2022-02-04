package sale.application.business.events;

import sale.domain.Sale;

public class SaleCanceledEvent extends SaleEvent {
    private final Sale sale;

    public SaleCanceledEvent(Sale sale) {
        this.sale = sale;
    }

    public Sale getSale() {
        return sale;
    }
}
