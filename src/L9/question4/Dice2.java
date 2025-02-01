package L9.question4;

import java.util.Random;

public class Dice2 {
    private int score;
    public Dice2(){
        this.score = 0;
    }
    public void rollDice(){
        Random rand = new Random();
        int dice = rand.nextInt(7);
        System.out.println("Rolled: " + dice);
        if(dice == 6){
            System.out.println("You rolled a 6! Roll again. ");
            int secondRoll = rand.nextInt(7);
            System.out.println("Second roll: " + secondRoll);
            if(secondRoll != 6){
                score += dice + secondRoll;
            }else{
                System.out.println("second roll is also 6. No score added");
            }
        }else{
            score += dice;
        }
        if(score > 100){
            System.out.println("score exceeded 100. Last roll not counted.");
            score -= dice;
        }
    }
    public int getScore(){
        return score;
    }
    public boolean hasWon(){
        return score == 100;
    }

}
