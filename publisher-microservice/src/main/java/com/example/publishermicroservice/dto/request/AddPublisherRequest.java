package com.example.publishermicroservice.dto.request;

import javax.persistence.Id;
import java.util.Arrays;
import java.util.Objects;

public class AddPublisherRequest {
    @Id
    private String publisherID;
    private String publisherName;
    private String publisherLogo;

    public AddPublisherRequest() {
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
    public String toString() {
        return "AddPublisherRequest{" +
                "publisherID='" + publisherID + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", publisherLogo=" + publisherLogo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddPublisherRequest that = (AddPublisherRequest) o;
        return getPublisherID().equals(that.getPublisherID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPublisherID());
    }
}
