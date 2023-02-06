package com.factoriaf5.kata;

public class Tenis {
    Player player1;
    Player player2;

    public Tenis() {
        this.player1 = new Player("player1");
        this.player2 = new Player("player2");
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void setFederer(Player federer) {
        player2 = federer;
    }

    public String punto(Player player) {
        if(player.getScore() < 40){
        player.setScore(player.getScore()+1);
        if(player.getScore() == 1)  return "Punto para " + player.getName() + ", suma 15";
        if(player.getScore() == 2)  return "Punto para " + player.getName() + ", suma 30";
        if(player.getScore() == 3)  return "Punto para " + player.getName() + ", suma 40";
        }
        player.setSets(player.getSets()+1);
        player.setScore(0);

        return "Juego para " + player.getName();

    }

    public String totalResult(Player player1, Player player2) {
        String result = player1.getScore() + " : " + player2.getScore();
        return result;
    }
}
