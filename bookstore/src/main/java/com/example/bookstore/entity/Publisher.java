package com.example.bookstore.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "publisher")
@DynamicUpdate
public class Publisher {
    @Id
    private String publisherID;
    @Column(columnDefinition = "longblob")
    private Byte[] PublisherLogo;
    @NotBlank
    private String PublisherName;

    public Publisher() {
    }

    public String getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(String publisherID) {
        this.publisherID = publisherID;
    }

    public Byte[] getPublisherLogo() {
        return PublisherLogo;
    }

    public void setPublisherLogo(Byte[] publisherLogo) {
        PublisherLogo = publisherLogo;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublisherName(String publisherName) {
        PublisherName = publisherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return getPublisherID().equals(publisher.getPublisherID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPublisherID());
    }
    @Override
    public String toString() {
        return "Publisher{" +
                "publisherID='" + publisherID + '\'' +
                ", PublisherLogo=" + Arrays.toString(PublisherLogo) +
                ", PublisherName='" + PublisherName + '\'' +
                '}';
    }
}
