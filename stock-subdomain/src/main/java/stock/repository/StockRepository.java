package stock.repository;

import stock.domain.Stock;
import stock.domain.StockKeepingUnit;

public interface StockRepository {
boolean existByStockKeepingUnit (StockKeepingUnit sku);
Stock add (Stock stock);
Stock update (Stock stock);

}
