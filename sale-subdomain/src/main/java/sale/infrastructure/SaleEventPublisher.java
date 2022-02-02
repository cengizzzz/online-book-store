package sale.infrastructure;

import sale.application.business.events.SaleEvent;

public interface SaleEventPublisher{
    void publishEvent(SaleEvent businessEvent);
}
