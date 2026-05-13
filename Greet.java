package com.example.hellospring.models;

public class Greet {
    private String message;


    // CONSTRUCTOR
    public Greet(String message) {
        this.message = message;
    }
// GETTER AND SETTERS


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
