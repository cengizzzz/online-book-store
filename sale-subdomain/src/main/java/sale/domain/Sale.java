package sale.domain;

import customer.domain.Customer;
import book.domain.Book;

import java.time.LocalDateTime;
import java.util.Objects;

public class Sale {
    private SaleID saleID;
    private Customer customer;
    private Book book;
    private TimeStamp timeStamp;

    public Sale(SaleID saleID, Customer customer, Book book, TimeStamp timeStamp) {
        this.saleID = saleID;
        this.customer = customer;
        this.book = book;
        this.timeStamp = timeStamp;
    }

    public static class Builder{
        private SaleID saleID;
        private Customer customer;
        private Book book;
        private TimeStamp timeStamp;

        public Builder saleID(int value){
            this.saleID = SaleID.of(value);
            return this;
        }
        public Builder customer(Customer value){
            this.customer = Customer.of(value);
            return this;
        }
        public Builder book(Book value){
            this.book = Book.of(value);
            return this;
        }
        public Builder timeStamp(LocalDateTime value){
            this.timeStamp = TimeStamp.of(value);
            return this;
        }
        public Sale build(){
            var sale = new Sale(saleID,customer,book,timeStamp);
            return sale;
        }
    }

    public SaleID getSaleID() {
        return saleID;
    }

    public void setSaleID(SaleID saleID) {
        this.saleID = saleID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public TimeStamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(TimeStamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return saleID.equals(sale.saleID) && Objects.equals(customer, sale.customer) && Objects.equals(book, sale.book) && Objects.equals(timeStamp, sale.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleID, customer, book, timeStamp);
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleID=" + saleID +
                ", customer=" + customer +
                ", book=" + book +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
