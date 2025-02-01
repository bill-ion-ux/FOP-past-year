package L9.question4;

import java.util.Random;

public class Dice {
    private int score;
    public Dice(){
        this.score = 0;
    }
    public void rollDice(){
        Random rand = new Random();
        int dice1 = rand.nextInt(7);
        int dice2 = rand.nextInt(7);

        System.out.println("Rolled: " + dice1 + "and " + dice2);
        if(dice1 == dice2){
            System.out.println("Both dice are equal! Roll again. ");
            score += dice1 + dice2;
            rollDice();
        }else{
            score += dice1 + dice2;
        }

    }
    public int getScore(){
        return score;
    }
    public boolean hasWon(){
        return score >= 100;
    }
}
