package L9.question1;

import java.util.Scanner;

public class Square extends Shape{
    private int length;
    public Square() {
        super("Square");
    }
    public void accepInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        this.length = scanner.nextInt();

    }
    public void calculate(){
        double perimeter = 4 * length;
        double area = length * length;
        setPerimeter(perimeter);
        setArea(area);
    }

}
