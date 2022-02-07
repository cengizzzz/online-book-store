package book.domain;

import java.util.List;

public final class Content {
    private final List<String> content;

    private Content(List<String> content) {
        this.content = content;
    }

    public static Content of(List<String> value) {
        // Validation olabilir.
        return new Content(value);
    }

    public List<String> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Content{" +
                "content=" + content +
                '}';
    }
}
