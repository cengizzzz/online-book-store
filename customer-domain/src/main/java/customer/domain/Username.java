package customer.domain;

public final class Username {
    private final String value;

    private Username(String value) {
        this.value = value;
    }

    public static Username of(String value) {
        return new Username(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Username [value=" + value + "]";
    }
}
