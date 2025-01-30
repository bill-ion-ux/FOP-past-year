package L8.question5;

import java.util.Random;

public class Game {
    private final String name;
    private int playerScore = 0;
    //constructor that only takes name as a parameter
    // can make the playerScore in the constructor but since i use return type
    //method so it is not necessary.

    public Game(String name) {
        this.name = name;
    }
    //Method to roll the dice, updating the score as well as display thw winner
    public int move(){
        Random rand = new Random();
        int diceRoll = rand.nextInt(7);
        playerScore += diceRoll;
        System.out.println("player 1 rolled a " + diceRoll +". Current score : " + playerScore);
        if(playerScore >= 100){
            System.out.println(name + " win by reaching 100 first!");
        }
        return playerScore;
    }

}
