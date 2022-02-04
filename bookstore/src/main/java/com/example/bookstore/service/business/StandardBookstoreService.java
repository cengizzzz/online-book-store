package com.example.bookstore.service.business;

import com.example.bookstore.dto.request.AddBookRequest;
import com.example.bookstore.dto.request.UpdateRequest;
import com.example.bookstore.dto.response.AddBookResponse;
import com.example.bookstore.dto.response.DeleteBookResponse;
import com.example.bookstore.dto.response.GetBookResponse;
import com.example.bookstore.dto.response.UpdateBookResponse;
import com.example.bookstore.service.BookstoreService;
import org.springframework.stereotype.Service;

@Service
public class StandardBookstoreService implements BookstoreService {

    @Override
    public GetBookResponse findBookByIdentity(String isbn) {
        return null;
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
    public DeleteBookResponse deleteBookByIdentity(String isbn) {
        return null;
    }
}
