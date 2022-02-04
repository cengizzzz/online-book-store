package sale.application.business.exception;

public class SaleNotFoundException extends RuntimeException{
    private final String saleID;

    public SaleNotFoundException(String message, String saleID) {
        super(message);
        this.saleID = saleID;
    }

    public String getSaleID() {
        return saleID;
    }
}
