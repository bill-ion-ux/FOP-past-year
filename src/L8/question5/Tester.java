package L8.question5;

public class Tester {
    public static void main(String[] args) {
        Game game = new Game("nabil");
        Game game1 = new Game("syizai");

        while(true){
            game1.move();
            if(game1.move() >= 100){
                break;
            }
            game.move();
            if (game.move() >= 100) {
                break;
            }
        }
    }
}
