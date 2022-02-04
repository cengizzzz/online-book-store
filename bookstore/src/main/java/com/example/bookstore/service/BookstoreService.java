package com.example.bookstore.service;

import com.example.bookstore.dto.request.AddBookRequest;
import com.example.bookstore.dto.request.UpdateRequest;
import com.example.bookstore.dto.response.AddBookResponse;
import com.example.bookstore.dto.response.DeleteBookResponse;
import com.example.bookstore.dto.response.GetBookResponse;
import com.example.bookstore.dto.response.UpdateBookResponse;

public interface BookstoreService {
    GetBookResponse findBookByIsbn(String isbn);
    AddBookResponse addBook(AddBookRequest request);
    UpdateBookResponse updateBook(UpdateRequest request);
    DeleteBookResponse deleteBookByIsbn(String isbn);
}
