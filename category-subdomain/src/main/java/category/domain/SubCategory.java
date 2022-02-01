package category.domain;

import java.util.Objects;

public class SubCategory {
    private final String subCategory;

    public SubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSubCategory() {
        return subCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubCategory that = (SubCategory) o;
        return subCategory.equals(that.subCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCategory);
    }

    @Override
    public String toString() {
        return "SubCategory{" +
                "subCategory='" + subCategory + '\'' +
                '}';
    }
}
