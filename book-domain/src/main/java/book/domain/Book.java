package book.domain;


import category.domain.Category;
import publisher.domain.Publisher;

import java.util.Objects;

public class Book {
    private final Isbn isbn;
    private Title title;
    private Author author;
    private Publisher publisher;
    private Edition edition;
    private PublicationYear publicationYear;
    private Price price;
    private Content content;
    private Popularity popularity;
    private CoverPhoto coverPhoto;
    private Reviews reviews;
    private Category category;

    public Book(Isbn isbn, Title title, Author author, Publisher publisher, Edition edition, PublicationYear publicationYear, Price price, Content content, Popularity popularity, CoverPhoto coverPhoto, Reviews reviews, Category category) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.publicationYear = publicationYear;
        this.price = price;
        this.reviews = reviews;
        this.category = category;
    }

    public Isbn getIsbn() {
        return isbn;
    }

    public Title getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Edition getEdition() {
        return edition;
    }

    public PublicationYear getPublicationYear() {
        return publicationYear;
    }

    public Price getPrice() {
        return price;
    }

    public Reviews getReviews() {
        return reviews;
    }

    public Category getCategory() {
        return category;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }

    public void setPublicationYear(PublicationYear publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Popularity getPopularity() {
        return popularity;
    }

    public void setPopulartiy(Popularity popularty) {
        this.popularity = popularty;
    }

    public CoverPhoto getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(CoverPhoto coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title=" + title +
                ", author=" + author +
                ", publisher=" + publisher +
                ", edition=" + edition +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", content=" + content +
                ", popularity=" + popularity +
                ", coverPhoto=" + coverPhoto +
                ", reviews=" + reviews +
                ", category=" + category +
                '}';
    }

    public static class Builder {
        private Isbn isbn;
        private Title title;
        private Author author;
        private Publisher publisher;
        private Edition edition;
        private PublicationYear publicationYear;
        private Price price;
        private Content content;
        private Popularity popularity;
        private CoverPhoto coverPhoto;
        private Reviews reviews;
        private Category category;

        public Builder isbn(String value) {
            this.isbn = Isbn.of(value);
            return this;
        }

        public Builder publicationYear(int value) {
                this.publicationYear = PublicationYear.of(value);
                return this;
            }

            public Builder price(double value) {
                this.price = Price.of(value);
            return this;
        }
        public Builder popularity(int value) {
            this.popularity = Popularity.of(value);
            return this;
        }

        public Book build() {
            var book = new Book(isbn, title, author, publisher, edition, publicationYear, price,content,popularity,coverPhoto, reviews, category);
            return book;
        }
    }
}
