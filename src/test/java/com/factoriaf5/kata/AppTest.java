package com.factoriaf5.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    Tenis game = new Tenis();
    Player Nadal = new Player("Nadal");
    Player Federer = new Player("Federer");

    @Test
    void player_point_15() {
        assertEquals("Punto para Nadal, suma 15", game.punto(Nadal));
    }

    @Test
    void player_point_30() {
        game.punto(Nadal);
        assertEquals("Punto para Nadal, suma 30", game.punto(Nadal));
    }

    @Test
    void player_point_40() {
        game.punto(Nadal);
        game.punto(Nadal);
        assertEquals("Punto para Nadal, suma 40", game.punto(Nadal));
    }

    @Test
    void player_win_juego() {
        game.punto(Nadal);
        game.punto(Nadal);
        game.punto(Nadal);
        assertEquals("Juego para Nadal", game.punto(Nadal));
    }
}
