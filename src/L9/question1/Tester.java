package L9.question1;

public class Tester {
    public static void main(String[] args) {
        rectangle rc = new rectangle();
        Circle circle = new Circle();
        Square square = new Square();
        rc.accepInput();
        rc.calculate();
        rc.display();

        circle.acceptInput();
        circle.calculate();
        circle.display();

        square.accepInput();
        square.calculate();
        square.display();

    }
}
