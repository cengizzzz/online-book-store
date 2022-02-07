package book.domain;

public final class Author {
    private final String author;

    private Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public static Author of(String value){
        // Validation olabilir
        return new Author(value);
    }

    @Override
    public String toString() {
        return "Author{" +
                "author='" + author + '\'' +
                '}';
    }
}
