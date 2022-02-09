package com.example.publishermicroservice.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="publisher")
@DynamicUpdate
public class Publisher{
    @Id
    private String publisherID;
    private String publisherName;
    private String publisherLogo;

    public Publisher() {
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

    public String getPublisherLogo() {
        return publisherLogo;
    }

    public void setPublisherLogo(String publisherLogo) {
        this.publisherLogo = publisherLogo;
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
                ", publisherName='" + publisherName + '\'' +
                ", publisherLogo=" + publisherLogo +
                '}';
    }
}
