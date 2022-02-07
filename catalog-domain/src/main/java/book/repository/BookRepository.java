package book.repository;

import book.domain.Book;
import book.domain.CategoryName;
import book.domain.Isbn;
import com.example.bookstore.dto.response.GetBookResponse;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    boolean existsByIsbn(Isbn isbn);

    List<GetBookResponse> findAllByPage(int page, int page2);
    Book update(Book book);

    Book add(Book book);

    Optional<Book> delete(Isbn isbn);

    Optional<Book> findBookByIsbn(Isbn isbn);
    List<String> findAllByCategory(CategoryName categoryName);


}
