package customer.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Email {
    private final String value;

    private Email(String value) {
        this.value = value;
    }

    public static Email of(String value) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        var result=matcher.matches();
        if (result==false)
            throw new IllegalArgumentException("Hatalı email!");
        return new Email(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Email [value=" + value + "]";
    }
}
