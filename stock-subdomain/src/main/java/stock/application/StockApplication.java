package stock.application;

import stock.domain.Stock;

public interface StockApplication {
    Stock addStock (Stock stock);
    Stock updateStock (Stock stock);
}
