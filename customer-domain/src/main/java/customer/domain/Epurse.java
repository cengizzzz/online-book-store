package customer.domain;


public class Epurse {
    private final double value;


    private Epurse(double value) {
        this.value = value;
    }

    public static Epurse of(double value) {
        if (value <0)
            throw new IllegalArgumentException("Epurse should be a positive");
        return new Epurse(value);
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Epurse [value=" + value + "]";
    }
}
