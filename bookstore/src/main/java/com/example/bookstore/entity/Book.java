package com.example.bookstore.entity;

import com.example.bookstore.validation.IsbnValidation;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name="book")
@DynamicUpdate
public class Book {
    @Id
    @IsbnValidation
    private String isbn;
    @NotBlank
    private String title;
    @NotBlank
    private String author;
    @ManyToOne
    private Publisher publisher;
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
    private Category category;

    public Book() {
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

    public Byte[] getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(Byte[] coverPhoto) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getIsbn().equals(book.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn());
    }

    @Override
    public String toString() {
        return "Book{" +
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
