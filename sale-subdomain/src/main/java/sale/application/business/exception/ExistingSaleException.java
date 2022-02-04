package sale.application.business.exception;

public class ExistingSaleException extends RuntimeException{
    private final String saleID;

    public ExistingSaleException(String message, String saleID) {
        super(message);
        this.saleID = saleID;
    }

    public String getSaleID() {
        return saleID;
    }

}
