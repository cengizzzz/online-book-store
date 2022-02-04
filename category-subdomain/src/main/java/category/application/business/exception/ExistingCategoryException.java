package category.application.business.exception;

public class ExistingCategoryException extends RuntimeException{
    private final String categoryId;

    public ExistingCategoryException(String message, String categoryId) {
        super(message);
        this.categoryId = categoryId;
    }

    public String getCategoryId() {
        return categoryId;
    }
}
