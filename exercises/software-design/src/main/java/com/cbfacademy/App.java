package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        Game game = GameFactory.create();
        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }

    private static SimpleContainer initialiseContainer() {
        SimpleContainer container = new SimpleContainer();

        // Register mappings for any required interfaces with their concrete implementations
        container.register(Game.class, DiceGame.class);

        container.register(Player.class, DicePlayer.class);
        return container;
    }
}
