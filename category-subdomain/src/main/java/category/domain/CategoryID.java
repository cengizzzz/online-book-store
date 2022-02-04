package category.domain;

import java.util.Objects;

public final class CategoryID {
    private final String categoryID;

    private CategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public static CategoryID of(String value) {
        // Validation olabilir
        return new CategoryID(value);
    }

    public String getCategoryID() {
        return categoryID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryID that = (CategoryID) o;
        return categoryID.equals(that.categoryID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID);
    }

    @Override
    public String toString() {
        return "CategoryID{" +
                "categoryID='" + categoryID + '\'' +
                '}';
    }
}
