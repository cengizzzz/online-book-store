package customer.domain;

public final class IsAdmin {
    private final String value;

    public IsAdmin(String value) {
        this.value = value;
    }

    public static IsAdmin of(String value) {
        return new IsAdmin(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "IsAdmin [value=" + value + "]";
    }
}
