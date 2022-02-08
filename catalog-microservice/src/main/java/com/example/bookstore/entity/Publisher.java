package com.example.bookstore.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "publisher")
@DynamicUpdate
public class Publisher {
    @Id
    private String publisherID;
    private String publisherName;
    private Byte[] publisherLogo;

    public Publisher() {

    }

    public Publisher(String publisherID, String publisherName, Byte[] publisherLogo) {
        this.publisherID = publisherID;
        this.publisherName = publisherName;
        this.publisherLogo = publisherLogo;
    }

    public String getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(String publisherID) {
        this.publisherID = publisherID;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Byte[] getPublisherLogo() {
        return publisherLogo;
    }

    public void setPublisherLogo(Byte[] publisherLogo) {
        this.publisherLogo = publisherLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(getPublisherID(), publisher.getPublisherID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPublisherID());
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherID='" + publisherID + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", publisherLogo=" + Arrays.toString(publisherLogo) +
                '}';
    }
}

