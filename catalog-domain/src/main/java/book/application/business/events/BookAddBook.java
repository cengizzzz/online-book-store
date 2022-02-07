package book.application.business.events;

import book.domain.Book;

public class BookAddBook extends BookEvent{
    private final Book book;

    public BookAddBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
