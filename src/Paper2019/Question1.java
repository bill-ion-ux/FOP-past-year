package Paper2019;

import java.util.Random;



public class Question1 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("This program shows the number of odd and even number from 10 random numbers. The random numbers must be from 0-100");
        int num, odd = 0, even = 0;
        for (int i = 0; i < 10; i++) {
            num = r.nextInt(101);
            System.out.print(num + " ");
            if (isEven(num)) {
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("\nNumber of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
