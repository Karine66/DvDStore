package com.mycompany.dvdstore.entity;

import org.springframework.data.annotation.Id;

public class Movie {

    @Id
    private Long id;
    private String title;
    private String gender;
    private String description;

    public Movie(Long id, String title, String gender) {
        this.id = id;
        this.title = title;
        this.gender = gender;
    }

    public Movie(Long id, String title, String gender, String description) {
        this.id = id;
        this.title = title;
        this.gender = gender;
        this.description = description;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
