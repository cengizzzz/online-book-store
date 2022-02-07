package book.domain;

public class CategoryName {
    private final String categoryName;

    public CategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "CategoryName{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}
