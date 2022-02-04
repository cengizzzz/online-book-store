package customer.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Password {
    private final String value;

    private Password(String value) {
        this.value = value;
    }

    public static Password of(String value) {
        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        var result=matcher.matches();
        if (result==false)
            throw new IllegalArgumentException("Hatalı parola girişi!");
        return new Password(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Password [value=" + value + "]";
    }
}
