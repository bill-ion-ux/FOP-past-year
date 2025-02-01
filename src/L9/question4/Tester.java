package L9.question4;

public class Tester {
    public static void main(String[] args) {
        System.out.println("testing dice game 1: ");
        Dice game1 = new Dice();
        while (!game1.hasWon()){
            game1.rollDice();
            System.out.println("Current Score: " + game1.getScore());
        }
        System.out.println("you won dice game 1 with a score of "+ game1.getScore());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("testing dice game 2: ");
        Dice2 game2 = new Dice2();
        while(!game2.hasWon()){
            game2.rollDice();
            System.out.println("Current score: " + game2.getScore());
        }
        System.out.println("You won Dice game 2 with a score of " + game2.getScore());

    }
}
