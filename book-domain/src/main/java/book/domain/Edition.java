package book.domain;

public class Edition {
    private final String edition;

    public Edition(String edition) {
        this.edition = edition;
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
