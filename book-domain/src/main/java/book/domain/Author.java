package book.domain;

import java.util.Objects;

public class Author {
    private final String author;

    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author='" + author + '\'' +
                '}';
    }
}
