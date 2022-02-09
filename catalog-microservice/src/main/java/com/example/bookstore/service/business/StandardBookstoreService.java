package com.example.bookstore.service.business;

import book.application.BookApplication;
import book.application.business.exception.BookNotFoundException;
import book.domain.Isbn;
import com.example.bookstore.dto.request.AddBookRequest;
import com.example.bookstore.dto.request.UpdateRequest;
import com.example.bookstore.dto.response.AddBookResponse;
import com.example.bookstore.dto.response.DeleteBookResponse;
import com.example.bookstore.dto.response.GetBookResponse;
import com.example.bookstore.dto.response.UpdateBookResponse;
import com.example.bookstore.service.BookstoreService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class StandardBookstoreService implements BookstoreService {

    private BookApplication bookApplication;
    private ModelMapper modelMapper;

    public StandardBookstoreService(BookApplication bookApplication, ModelMapper modelMapper) {
        this.bookApplication = bookApplication;
        this.modelMapper = modelMapper;
    }

    @Override
    public GetBookResponse findBookByIsbn(String isbn) {
        var book = bookApplication.findBookByIsbn(Isbn.of(isbn));
        if (book.isEmpty())
            throw new BookNotFoundException("Cannot find book", isbn);
        return modelMapper.map(book.get(), GetBookResponse.class);
    }

    @Override
    public AddBookResponse addBook(AddBookRequest request) {
        return null;
    }

    @Override
    public UpdateBookResponse updateBook(UpdateRequest request) {
        return null;
    }

    @Override
    public DeleteBookResponse deleteBookByIsbn(String isbn) {
        return null;
    }
}
