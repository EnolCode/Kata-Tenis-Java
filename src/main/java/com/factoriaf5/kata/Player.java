package com.factoriaf5.kata;

public class Player{

    private int score = 0;
    private int set = 0;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSet() {
        return set;
    }
    public void setSet(int set) {
        this.set = set;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public Player(String name) {
        this.name = name;
    }

}
