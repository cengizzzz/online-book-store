package customer.domain;

public final class IsAdmin {
    private final boolean value;

    private IsAdmin(boolean value) {
        this.value = value;
    }

    public static IsAdmin of(boolean value) {
        return new IsAdmin(value);
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "IsAdmin [value=" + value + "]";
    }
}
