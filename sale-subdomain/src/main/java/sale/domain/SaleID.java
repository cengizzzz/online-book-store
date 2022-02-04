package sale.domain;

import java.util.Objects;

public final class SaleID {
    private final int saleID;

    private SaleID(int saleID) {
        this.saleID = saleID;
    }

    public static SaleID of(int value) {
        return new SaleID(value);
    }

    public int getSaleID() {
        return saleID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleID saleID1 = (SaleID) o;
        return saleID == saleID1.saleID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleID);
    }
}