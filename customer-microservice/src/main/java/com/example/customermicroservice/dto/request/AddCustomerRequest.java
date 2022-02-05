package com.example.customermicroservice.dto.request;

import com.example.customermicroservice.validation.TcKimlikNo;
import customer.domain.Interests;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class AddCustomerRequest {
    @TcKimlikNo
    private String identity;
    @NotBlank
    private String fullname;
    @Min(6)
    private int age;
    private String location;
    private Interests interests;
    @Email
    @Column(unique = true)
    private String email;
    @Min(1000)
    private double epurse;
    @NotBlank
    private String username;
    private String password;
    private boolean isAdmin;

    public AddCustomerRequest() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Interests getInterests() {
        return interests;
    }

    public void setInterests(Interests interests) {
        this.interests = interests;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getEpurse() {
        return epurse;
    }

    public void setEpurse(double epurse) {
        this.epurse = epurse;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "AddCustomerRequest{" +
                "identity='" + identity + '\'' +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", interests=" + interests +
                ", email='" + email + '\'' +
                ", epurse=" + epurse +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
