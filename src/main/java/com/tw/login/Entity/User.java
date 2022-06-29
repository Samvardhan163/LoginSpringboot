package com.tw.login.Entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false,unique = true,length = 45)
    private  String email;

    @Column(nullable = false,length = 45)
    private  String password;

    @Column(nullable = false,length = 20)
    private String firstName;

    @Column(nullable = false,length = 20)
    private String lastName;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
