package L9.question1;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle extends Shape{
    private double diameter;
    public Circle(){
        super("Circle");
    }
    public void acceptInput(){
        System.out.println("\nEnter the diameter of the circle: ");
        Scanner scanner = new Scanner(System.in);
        this.diameter = scanner.nextDouble();
    }
    public void calculate(){
        double perimeter = PI * diameter;
        double area = PI * Math.pow(diameter/2,2);
        setArea(area);
        setPerimeter(perimeter);

    }

}
