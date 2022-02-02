package book.domain;

import java.util.List;

public class Content {
    private final List<Content> content;

    public Content(List<Content> content) {
        this.content = content;
    }

    public List<Content> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Content{" +
                "content=" + content +
                '}';
    }
}
