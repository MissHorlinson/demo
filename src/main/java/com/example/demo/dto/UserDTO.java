package com.example.demo.dto;

public class UserDTO {

    private Long id;
    private String name;
    private String surname;
    private String level;

    public UserDTO(String name, String surname, String level) {
        this.name = name;
        this.surname = surname;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
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

    @Override
    public String toString() {
        return "UserDTO { " +
                "id = " + id +
                ", name = '" + name + "\'" +
                ", surname = '" + surname + "\'" +
                ", level = '" + level + "\'" +
                "}";
    }
}
