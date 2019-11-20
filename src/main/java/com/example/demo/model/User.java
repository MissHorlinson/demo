package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_surname")
    private String surname;
    @Column(name = "user_level")
    private String level;

    public User() {}

    public User(String name, String surname, String level) {
        this.name = name;
        this.surname = surname;
        this.level = level;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(String surname) {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}