package category.application.business.events;

import category.domain.Category;

public class CategoryGetCategory {
    private final Category categoryID;

    public CategoryGetCategory(Category categoryID) {
        this.categoryID = categoryID;
    }

    public Category getCategoryID() {
        return categoryID;
    }
}
