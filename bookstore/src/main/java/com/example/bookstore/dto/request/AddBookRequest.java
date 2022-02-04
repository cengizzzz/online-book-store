package com.example.bookstore.dto.request;

import category.domain.Category;
import com.example.bookstore.validation.IsbnValidation;
import publisher.domain.Publisher;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.util.List;

public class AddBookRequest {
    @IsbnValidation
    private String isbn;
    @NotBlank
    private String title;
    @NotBlank
    private String author;
    private Publisher publisher;
    private String edition;
    private int publicationYear;
    @NotBlank
    private double price;
    private List<String> content;
    private int popularity;
    private byte[] coverPhoto;
    private List<String> reviews;
    private Category category;
/*
    @Id
    @IsbnValidation
    private String isbn;
    @NotBlank
    private String title;
    @NotBlank
    private String author;
    @ManyToOne
    private com.example.bookstore.entity.Publisher publisher;
    @NotBlank
    private String edition;
    private int publicationYear;
    private double price;
    @ElementCollection
    private List<String> content;
    private int popularity;
    @Column(columnDefinition = "longblob")
    private Byte[] coverPhoto;
    @ElementCollection
    private List<String> reviews;
    @ManyToOne
    private com.example.bookstore.entity.Category category;

 */
}
