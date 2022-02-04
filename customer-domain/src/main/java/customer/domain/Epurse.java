package customer.domain;

public final class Epurse {
    private final int value;

    private Epurse(int value) {
        this.value = value;
    }

    public static Epurse of(int value) {
        if (value <0)
            throw new IllegalArgumentException("Epurse should be a positive");
        return new Epurse(value);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Epurse [value=" + value + "]";
    }
}
