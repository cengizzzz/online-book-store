package com.example.publishermicroservice.dto.response;

import java.util.Arrays;

public class AddPublisherResponse {
    private String publisherID;
    private String publisherName;
    private String publisherLogo;

    public AddPublisherResponse() {
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
        return "AddPublisherResponse{" +
                "publisherID='" + publisherID + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", publisherLogo=" + publisherLogo +
                '}';
    }
}
