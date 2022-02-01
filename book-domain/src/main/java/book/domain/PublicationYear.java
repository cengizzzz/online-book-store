package book.domain;

public class PublicationYear {
    private final int publicationYear;

    public PublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "PublicationYear{" +
                "publicationYear=" + publicationYear +
                '}';
    }
    public static PublicationYear of(int value) {
        if (value>=2022 && value <1900)
            throw new IllegalArgumentException("Invalid date");
        return new PublicationYear(value);
    }
}
