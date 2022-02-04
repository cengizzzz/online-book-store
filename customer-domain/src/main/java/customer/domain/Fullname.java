package customer.domain;

public final class Fullname {
    private final String value;

    private Fullname(String value) {
        this.value = value;
    }

    public static Fullname of(String value) {
        return new Fullname(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Fullname [value=" + value + "]";
    }
}
