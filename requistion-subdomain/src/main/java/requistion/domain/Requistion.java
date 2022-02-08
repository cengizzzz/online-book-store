package requistion.domain;

import book.domain.Isbn;

import publisher.domain.Publisher;

public class Requistion {
    private RequistionID requistionID;
    private Isbn isbn;
    private Publisher publisher;

    public static class Builder {
        private RequistionID requistionID;
        private Isbn isbn;
        private Publisher publisher;

        public Builder requistionID(String value){
            this.requistionID = RequistionID.of(value);
            return this;
        }
        public Builder isbn(String value){
            this.isbn = Isbn.of(value);
            return this;
        }
        public Builder publisher(Publisher value){
            this.publisher = Publisher.of(value);
            return this;
        }
        public Requistion build() {
            var requistion = new Requistion(requistionID,isbn,publisher);
            return requistion;
        }
    }


    public Requistion(RequistionID requistionID, Isbn isbn, Publisher publisher) {
        this.requistionID = requistionID;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public RequistionID getRequistionID() {
        return requistionID;
    }

    public void setRequistionID(RequistionID requistionID) {
        this.requistionID = requistionID;
    }

    public Isbn getIsbn() {
        return isbn;
    }

    public void setIsbn(Isbn isbn) {
        this.isbn = isbn;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

}
