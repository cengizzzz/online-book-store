package sale.application.business;

import sale.application.SaleApplication;
import sale.infrastructure.SaleEventPublisher;
import sale.repository.SaleRepository;

public class StandardSaleApplication implements SaleApplication {
    private SaleRepository saleRepository;
    private SaleEventPublisher eventPublisher;

    public StandardSaleApplication(SaleRepository saleRepository, SaleEventPublisher eventPublisher) {
        this.saleRepository = saleRepository;
        this.eventPublisher = eventPublisher;
    }


}
