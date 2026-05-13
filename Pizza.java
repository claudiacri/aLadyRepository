package com.example.hellospring.models;

public class Pizza {
    private String name;
    private String size;
    private int score;

    public Pizza(String name, String size, int score) {
        this.name = name;
        this.size = size;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
