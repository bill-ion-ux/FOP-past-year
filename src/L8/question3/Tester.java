package L8.question3;

public class Tester {
    public static void main(String[] args) {
        //Define a class name WeightCalculator. The class has an input method that accepts the
        //user’s age and height. Besides, the class consists a method that calculating the
        //recommend weight with this formula
        //recommend weight = (height – 100 + age / 10) * 0.9
        //The class will display the user’s age, height and the recommend weight. Create a
        //Tester class to test the program.
        WeightCalculator wc = new WeightCalculator(20, 171.2);
        wc.calculateWeight();
    }
}
