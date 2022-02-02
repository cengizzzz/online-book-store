package book.application.business.events;

import book.domain.Book;

public class BookDeleBook extends BookEvent {
    private final Book book;

    public BookDeleBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
