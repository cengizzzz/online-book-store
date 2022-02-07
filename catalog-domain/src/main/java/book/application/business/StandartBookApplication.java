package book.application.business;

import book.application.BookApplication;
import book.application.business.events.BookAddBook;
import book.application.business.events.BookDeleBook;
import book.application.business.exception.BookNotFoundException;
import book.application.business.exception.ExistingBookException;
import book.domain.Book;
import book.domain.Isbn;
import book.infrastructure.EventPublisher;
import book.repository.BookRepository;

import java.util.List;
import java.util.Optional;

public class StandartBookApplication implements BookApplication
{
    private BookRepository bookRepository;
    private EventPublisher eventPublisher;
    public StandartBookApplication(BookRepository bookRepository, EventPublisher eventPublisher) {
        this.bookRepository = bookRepository;
        this.eventPublisher = eventPublisher;
    }

    @Override
    public Book addBook(Book book) {
        var no =book.getIsbn();
        if (bookRepository.existsByIsbn(no)){
            throw new ExistingBookException("Book already exist", no.getValue());
        }
        Book addBook = bookRepository.add(book);
        var businessEvent = new BookAddBook(addBook);
        eventPublisher.publishEvent(businessEvent);
        return addBook;
    }

    @Override
    public Book deleBook(Isbn isbn) {
        Optional<Book> deleteBook = bookRepository.delete(isbn);
        var book = deleteBook.orElseThrow(() -> new BookNotFoundException(
                "Book does not exist", isbn.getValue()));
        eventPublisher.publishEvent(new BookDeleBook(book));
        return book;
    }

    @Override
    public Optional<Book> findBookByIsbn(Isbn isbn) {
        return bookRepository.findBookByIsbn(isbn);
    }

    @Override
    public Book updateBook(Book book) {
        var no =book.getIsbn();
        if (!bookRepository.existsByIsbn(no)){
            throw new BookNotFoundException("Book does not exist", no.getValue());
        }
        Book update = bookRepository.update(book);
        var businessEvent = new BookAddBook(update);
        eventPublisher.publishEvent(businessEvent);
        return update;
    }

    @Override
    public List<Book> findByCategory(List<String> categoryName) {
        return null;
    }
}
