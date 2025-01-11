package Question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        1(a) Write a program that reads a sequence of input numbers
//        and counts the number of positive numbers, negative numbers,
//        and zeros.
//        The program ends when the user enters X.
//        int countPos = 0;
//        int countNeg = 0;
//        int countZero = 0;
//
//
//        while(true){
//            System.out.print("Enter a number: ");
//            String num = scan.nextLine();
//            if(num.equalsIgnoreCase("x")){
//                break;
//            }
//            if(Integer.parseInt(num) > 0) {
//                countPos++;
//            }
//            else if(Integer.parseInt(num) < 0) {
//                countNeg++;
//            }
//            else {
//                countZero++;
//            }
//        }
//        System.out.println("Positive numbers: " + countPos);
//        System.out.println("Negative numbers: " + countNeg);
//        System.out.println("Zero numbers: " + countZero);
        System.out.println("Enter N value: ");
        int n = scan.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double)1/i;
        }
        System.out.println("Sum: " + sum);
    }
}
