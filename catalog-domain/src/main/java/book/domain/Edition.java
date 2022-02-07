package book.domain;

public final class Edition {
    private final String edition;

    private Edition(String edition) {
        this.edition = edition;
    }

    public static Edition of(String value) {
        // Validation olabilir
        return new Edition(value);
    }

    public String getEdition() {
        return edition;
    }



    @Override
    public String toString() {
        return "Edition{" +
                "edition='" + edition + '\'' +
                '}';
    }
}
