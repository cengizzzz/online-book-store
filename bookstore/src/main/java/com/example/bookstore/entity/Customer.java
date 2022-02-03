package com.example.bookstore.entity;



import com.example.bookstore.validation.TcKimlikNo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.awt.*;
import java.util.List;


@Entity
@Table(name="customers")
public class Customer {
    @Id
    @TcKimlikNo
    private String identity;
    @NotBlank
    private String fullname;
    @Min(6)
    private int age;
    private String location;
    private Interests interests;
    private String email;
    private int epurse;
    @NotBlank
    private String username;
    private String password;
    private boolean isAdmin;
}
