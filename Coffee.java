package com.example.hellospring.models;


// creo public class
public class Coffee {
    private String name;
    private String origin;
    private int score;


    // constructor
    public Coffee(String name, String origin, int score) {
        this.name = name;
        this.origin = origin;
        this.score = score;
    }
//getters and setters
    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public int getScore() {
        return score;



    }

}



