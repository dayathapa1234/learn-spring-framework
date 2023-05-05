package com.in28minutes.learnspringframework.game;

public class GameRunner {
    //Tightly coupled due to MarioGame, ContraGame .. need to change this everytime game is switched.
    //private MarioGame game;
    //private SuperContraGame game;
    // Using interface makes it loosely coupled
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run(){
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
