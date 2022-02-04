package book.domain;

import java.util.Objects;

public final class Title {
    private final String title;

    private Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static Title of(String value){
        // Validation olabilir
        return new Title(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title1 = (Title) o;
        return getTitle().equals(title1.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }

    @Override
    public String toString() {
        return "Title{" +
                "title='" + title + '\'' +
                '}';
    }
}
