package book.domain;

import publisher.domain.Publisher;
import java.util.List;
import java.util.Objects;

public class Book {
    private final Isbn isbn;
    private Title title;
    private Author author;
    private Publisher publisher;
    private Edition edition;
    private PublicationYear publicationYear;
    private Price price;
    private CategoryName categoryName;
    private Content content;
    private Popularity popularity;
    private CoverPhoto coverPhoto;
    private Reviews reviews;

    private Book(Isbn isbn, Title title, CategoryName categoryName, Author author, Publisher publisher, Edition edition, PublicationYear publicationYear, Price price, Content content, Popularity popularity, CoverPhoto coverPhoto, Reviews reviews) {
        this.isbn = isbn;
        this.categoryName = categoryName;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.publicationYear = publicationYear;
        this.price = price;
        this.content = content;
        this.popularity = popularity;
        this.coverPhoto = coverPhoto;
        this.reviews = reviews;
    }

    public static Book of(Book value) {
        return new Book(value.isbn, value.title, value.categoryName, value.author, value.publisher,
                value.edition, value.publicationYear, value.price, value.content, value.popularity, value.coverPhoto, value.reviews);
    }

    public CategoryName getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(CategoryName categoryName) {
        this.categoryName = categoryName;
    }

    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
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
                ", categoryName=" + categoryName +
                ", content=" + content +
                ", popularity=" + popularity +
                ", coverPhoto=" + coverPhoto +
                ", reviews=" + reviews +
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
        private CategoryName categoryName;
        private Content content;
        private Popularity popularity;
        private CoverPhoto coverPhoto;
        private Reviews reviews;

        public Builder isbn(String value) {
            this.isbn = Isbn.of(value);
            return this;
        }

        public Builder title(String value) {
            this.title = Title.of(value);
            return this;
        }

        public Builder author(String value) {
            this.author = Author.of(value);
            return this;
        }

        public Builder publisher(Publisher value) {
            this.publisher = Publisher.of(value);
            return this;
        }

        public Builder edition(String value) {
            this.edition = Edition.of(value);
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

        public Builder content(List<String> value) {
            this.content = Content.of(value);
            return this;
        }

        public Builder popularity(int value) {
            this.popularity = Popularity.of(value);
            return this;
        }

        public Builder coverPhoto(byte[] value) {
            this.coverPhoto = CoverPhoto.valueOf(value);
            return this;
        }

        public Builder reviews(List<String> value) {
            this.reviews = Reviews.of(value);
            return this;
        }

        public Book build() {
            var book = new Book(isbn, title, categoryName, author, publisher, edition, publicationYear, price, content, popularity, coverPhoto, reviews);
            return book;
        }
    }
}
