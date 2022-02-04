package category.application.business.exception;

public class CategoryNotFoundException extends RuntimeException{

    private final String categoryId;

    public CategoryNotFoundException(String message, String categoryId) {
        super(message);
        this.categoryId = categoryId;
    }

    public String getCategoryId() {
        return categoryId;
    }
}
