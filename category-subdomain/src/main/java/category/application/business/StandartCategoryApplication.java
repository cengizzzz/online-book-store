package category.application.business;

import category.application.CategoryApplication;
import category.domain.Category;
import category.infrastructure.EventPublisher;
import category.repository.CategoryRepository;

public class StandartCategoryApplication implements CategoryApplication {
    private CategoryRepository categoryRepository;
    private EventPublisher eventPublisher;

    public StandartCategoryApplication(CategoryRepository categoryRepository, EventPublisher eventPublisher) {
        this.categoryRepository = categoryRepository;
        this.eventPublisher = eventPublisher;
    }

    @Override
    public Category getCategory(Category categoryID) {
        return categoryRepository.getCategory(categoryID);
    }
}
