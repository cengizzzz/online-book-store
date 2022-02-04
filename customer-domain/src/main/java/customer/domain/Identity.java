package customer.domain;

import java.util.Objects;

public final class Identity {
    private final String value;

    private Identity(String value) {
        this.value = value;
    }

    public static Identity of(String value) {
        if (value == null) throw new IllegalArgumentException("Hatalı identity!");

        if (value.length() != 11) throw new IllegalArgumentException("Hatalı identity!");

        char[] chars = value.toCharArray();
        int[] a = new int[11];

        for (int i = 0; i < 11; i++) {
            a[i] = chars[i] - '0';
        }
        if (a[0] == 0) throw new IllegalArgumentException("Hatalı identity!");
        if (a[10] % 2 == 1) throw new IllegalArgumentException("Hatalı identity!");

        if (((a[0] + a[2] + a[4] + a[6] + a[8]) * 7 - (a[1] + a[3] + a[5] + a[7])) % 10 != a[9])
            throw new IllegalArgumentException("Hatalı identity!");

        if ((a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7] + a[8] + a[9]) % 10 != a[10])
            throw new IllegalArgumentException("Hatalı identity!");
        return new Identity(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Identity identity = (Identity) o;
        return value.equals(identity.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Identity [value=" + value + "]";
    }
}
