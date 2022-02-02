package sale.application.business.events;

import sale.domain.Sale;

public class SaleOccuredEvent extends SaleEvent{
    private final Sale sale;

    public SaleOccuredEvent(Sale sale) {
        this.sale = sale;
    }
    public Sale getSale() {
        return sale;
    }
}
