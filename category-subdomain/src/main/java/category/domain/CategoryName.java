package category.domain;

import java.util.Objects;

public final class CategoryName {
    private final String categoryName;

    private CategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public static CategoryName of(String value) {
        // Validation olabilir
        return new CategoryName(value);
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryName that = (CategoryName) o;
        return categoryName.equals(that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryName);
    }

    @Override
    public String toString() {
        return "CategoryName{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}
