package book.domain;

import java.util.List;

public final class CategoryName {
    private final List<String> categoryName;

    private CategoryName(List categoryName) {
        this.categoryName = categoryName;
    }

    public List getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "CategoryName{" +
                "categoryName=" + categoryName +
                '}';
    }
}
