package com.example.bookstore.dto.request;

import category.domain.Category;
import com.example.bookstore.validation.IsbnValidation;
import publisher.domain.Publisher;

import javax.validation.constraints.NotBlank;
import java.util.Arrays;
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

    public AddBookRequest() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public byte[] getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(byte[] coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "AddBookRequest{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher=" + publisher +
                ", edition='" + edition + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", content=" + content +
                ", popularity=" + popularity +
                ", coverPhoto=" + Arrays.toString(coverPhoto) +
                ", reviews=" + reviews +
                ", category=" + category +
                '}';
    }
}