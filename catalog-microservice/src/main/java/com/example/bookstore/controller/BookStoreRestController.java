package com.example.bookstore.controller;

import com.example.bookstore.dto.request.AddBookRequest;
import com.example.bookstore.dto.request.UpdateRequest;
import com.example.bookstore.dto.response.AddBookResponse;
import com.example.bookstore.dto.response.DeleteBookResponse;
import com.example.bookstore.dto.response.GetBookResponse;
import com.example.bookstore.dto.response.UpdateBookResponse;
import com.example.bookstore.service.BookstoreService;
import com.example.bookstore.validation.IsbnValidation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
@RequestMapping("book")
@CrossOrigin
@Validated
@Api( tags = "Book")

public class BookStoreRestController {

    private BookstoreService bookStoreServis;

    public BookStoreRestController(BookstoreService bookStoreServis) {
        this.bookStoreServis = bookStoreServis;
    }

    @GetMapping("{isbn}")
    @ApiOperation(value = "This method is used to get the book for the given {isbn}")
    public GetBookResponse getBookByIsbn(@PathVariable @IsbnValidation String isbn){
        return bookStoreServis.findBookByIsbn(isbn);
    }
    @PostMapping
    public AddBookResponse addBook(@RequestBody @Validated AddBookRequest request){
                return bookStoreServis.addBook(request);

    }
    @DeleteMapping("isbn")
    public DeleteBookResponse deleteBookResponse(@PathVariable @IsbnValidation  String isbn){
        return bookStoreServis.deleteBookByIsbn(isbn);
    }
    @PutMapping("isbn")
    public UpdateBookResponse updateBookResponse(@RequestBody @Validated UpdateRequest request){
        return bookStoreServis.updateBook(request);

    }
}
