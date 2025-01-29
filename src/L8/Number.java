package L8;
import java.util.*;

public class Number {
    private int[] Numbers;
    public Number(){
        this(10,100);
    }
    public Number(int size){
        this(size,100);
    }
    public Number(int size, int range){
        Numbers = new int[size];
        Random rand = new Random();
        for (int i = 0; i <Numbers.length ; i++) {
            Numbers[i] = rand.nextInt(range + 1);
        }
    }
    public void displayAllNumbers(){
        System.out.println("All items: " + Arrays.toString(Numbers));
    }
    public void displayEven(){
        System.out.print("Even number : ");
        for(int num : Numbers){
            if(num % 2 == 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public boolean isPrime(int num){
        if(num <=1) return false;
        for (int i = 2; i < num ; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    public void displayPrime(){
        System.out.print("Prime numbers: ");
        for (int num : Numbers) {
            if(isPrime(num)){
                System.out.print(num + " ");
            }
            
        }
        System.out.println();
    }
    public void displayMax(){
        int max = Numbers[0];
        for(int num : Numbers){
            if(num > max){
                max = num;
            }
        }
        System.out.println("maximum number is " + max);
    }
    public void displayMin(){
        int min = Numbers[0];
        for(int num : Numbers){
            if(num < min){
                min = num;
            }
        }
        System.out.println("minimum number is " + min);
    }
    public void displayAverage(){
        int sum = 0;
        for(int num : Numbers){
            sum += num;
        }
        double average = (double)sum / Numbers.length;
        System.out.println("Average: " + average);

    }
    public void displaySquare(){
        System.out.print("Square numbers : ");
        for(int num : Numbers){
            int sqrt = (int)Math.sqrt(num);
            if(sqrt * sqrt == num){
                System.out.print(num + " ");
            }
        }
        System.out.println();

    }
}
