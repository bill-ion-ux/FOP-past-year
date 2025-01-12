package Paper2020;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("This program changes all the odd numbers in the array into even numbers.");
        Scanner s = new Scanner(System.in);
        int size = 5;
        int num[] = new int[size];
        System.out.print("Enter five integer numbers: ");
        for (int i = 0; i < size ; i++) {
            num[i] = s.nextInt();
      ;
        }
        convert(num);
        System.out.println("The numbers are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
    }
    public static void convert(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 1){
                a[i] = a[i] + 1;
            }
        }
    }
}
