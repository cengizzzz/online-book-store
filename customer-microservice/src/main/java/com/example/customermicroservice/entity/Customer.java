package com.example.customermicroservice.entity;

import com.example.customermicroservice.validation.TcKimlikNo;
import customer.domain.Interests;
import org.hibernate.annotations.DynamicUpdate;
//import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

//@Document(collection = "employees")

@Entity
@Table(name="customers")
@DynamicUpdate
public class Customer {
    @Id
    @TcKimlikNo
    private String identity;
    @NotBlank
    private String fullname;
    @Min(6)
    private int age;
    private String location;
    @Enumerated(EnumType.STRING)
    private Interests interests;
    @Email
    @Column(unique = true)
    private String email;
    @Min(1000)
    private double epurse;
    @NotBlank
    private String username;
    private String password;
    private String isAdmin;

    public Customer() {
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

    public String isAdmin() {
        return isAdmin;
    }

    public void setAdmin(String admin) {
        isAdmin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(identity, customer.identity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }

    @Override
    public String toString() {
        return "Customer{" +
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
