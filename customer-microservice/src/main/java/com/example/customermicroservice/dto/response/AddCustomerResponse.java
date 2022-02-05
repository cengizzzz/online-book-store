package com.example.customermicroservice.dto.response;

public class AddCustomerResponse {
    private String identity;
    private String fullname;

    public AddCustomerResponse() {
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "AddCustomerResponse{" +
                "identity='" + identity + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
