package L8.question3;

public class WeightCalculator {
    private final double height;
    private final int age;
    public WeightCalculator(int age, double height){ //take input for age and height
        this.age = age;
        this.height = height;

    }
    public void calculateWeight(){
        double weight = (height - 100 + (double)(age/10))*0.9;
        System.out.println("age : " + age );
        System.out.println("height : " + height );
        System.out.println("recommend weight : " + weight );

    }
}
