package category.repository;

import category.domain.Category;

public interface CategoryRepository {
    Category getCategory(Category categoryID);
}
