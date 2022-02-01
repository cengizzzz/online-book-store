package book.domain;

import java.util.List;

public class Reviews {
    private final List<Reviews> reviews;

    public Reviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "reviews=" + reviews +
                '}';
    }
}
