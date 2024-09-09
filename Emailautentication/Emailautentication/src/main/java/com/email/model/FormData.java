package com.email.model;

import jakarta.persistence.Entity;


public class FormData {
    private String fullName;
    private String email;

    // Constructors
    public FormData() {}

    public FormData(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}