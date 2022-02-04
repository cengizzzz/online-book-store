package book.domain;

import java.util.Objects;

public final class Popularity {
    private final int popularity;

    private Popularity(int popularity) {
        this.popularity = popularity;
    }

    public int getPopularity() {
        return popularity;
    }

    @Override
    public String toString() {
        return "Popularity{" +
                "popularity=" + popularity +
                '}';
    }
    public static Popularity of(int popularity) {
        if (popularity <= 0.0)
            throw new IllegalArgumentException("Money value cannot be below zero and negative!");
        return new Popularity(popularity);
    }
}
