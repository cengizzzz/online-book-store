package book.domain;

import java.util.List;

public class Content {
    private final List<String> content;

    public Content(List<String> content) {
        this.content = content;
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
