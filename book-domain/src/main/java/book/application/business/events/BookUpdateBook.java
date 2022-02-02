package book.application.business.events;

import book.domain.Book;

public class BookUpdateBook extends BookEvent {
    private final Book book;

    public BookUpdateBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}

