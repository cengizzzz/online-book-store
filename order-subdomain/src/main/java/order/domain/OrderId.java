package order.domain;

public class OrderId {
    private final String value;

    public OrderId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public OrderId Of(String value) {

        return new OrderId(value);
    }

    @Override
    public String toString() {
        return "OrderId{" +
                "value='" + value + '\'' +
                '}';
    }


}
