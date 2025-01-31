package L9.question1;

public class Shape {
    private final String name;
    private double perimeter,area;
    public Shape(String name){
        this.name = name;
    }
    public void display(){
        System.out.printf("name: " + name + " perimeter: %.2f  area: %.2f",perimeter,area);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
