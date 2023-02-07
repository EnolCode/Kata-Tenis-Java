package com.factoriaf5.kata;

public class Player{

    private int score = 0;
    private int sets = 0;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSets() {
        return sets;
    }
    public void setSets(int sets) {
        this.sets = sets;
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
