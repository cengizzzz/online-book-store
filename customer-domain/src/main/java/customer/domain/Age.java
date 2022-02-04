package customer.domain;

public final class Age {

    private final int value;

    private Age(int value) {
        this.value = value;
    }

    public static Age of(int value) {
        if (value <= 5)
            throw new IllegalArgumentException("Age should be greater than 5");
        return new Age(value);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Age [value=" + value + "]";
    }

}



