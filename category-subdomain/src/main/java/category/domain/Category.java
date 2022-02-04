package category.domain;

import java.util.Objects;

public class Category {
    private CategoryID categoryID;
    private CategoryName categoryName;
    private SubCategory subCategory;

    public Category(CategoryID categoryID, CategoryName categoryName, SubCategory subCategory) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.subCategory = subCategory;
    }

    public static Category of(Category value) {
        // Validation olabilir.
        return new Category(value.categoryID, value.categoryName, value.subCategory);
    }


    public CategoryID getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(CategoryID categoryID) {
        this.categoryID = categoryID;
    }

    public CategoryName getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(CategoryName categoryName) {
        this.categoryName = categoryName;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return categoryID.equals(category.categoryID) && Objects.equals(categoryName, category.categoryName) && Objects.equals(subCategory, category.subCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID, categoryName, subCategory);
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryID=" + categoryID +
                ", categoryName=" + categoryName +
                ", subCategory=" + subCategory +
                '}';
    }
    public static class Builder {
        private CategoryID categoryID;
        private CategoryName categoryName;
        private SubCategory subCategory;

        public Builder categoryID(String value){
            this.categoryID = CategoryID.of(value);
            return this;
        }
        public Builder categoryName(String value){
            this.categoryName = CategoryName.of(value);
            return this;
        }
        public Builder subCategory(String value){
            this.subCategory = SubCategory.of(value);
            return this;
        }
        public Category build(){
            var category = new Category(categoryID, categoryName, subCategory);
            return category;
        }
    }
}
