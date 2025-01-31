package L9.question1;

import java.util.Scanner;

public class rectangle extends Shape{
    private int width,height;

    public rectangle() {
        super("Rectangle");
    }
    public void accepInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        this.width = scanner.nextInt();
        System.out.print("Enter height: ");
        this.height = scanner.nextInt();
    }
    public void calculate(){
        double perimeter = 2*(width + height);
        double area = width * height;
        setPerimeter(perimeter);
        setArea(area);
    }

}
