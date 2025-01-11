package Question4;

import java.util.Random;

public class Seat {
    public static int[][] initializeSeatingPlan(int rows, int columns){
        Random rand = new Random();
        int[][] seatingPlan = new int[rows][columns];
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                seatingPlan[i][j] = rand.nextInt(0,2); // 0 = empty, 1 = occupied

            }
        }
        return seatingPlan;
    }
    public static void analyzeSeating(int[][] seatingPlan){
        int count = 0;
        int sumRow = 0;
        int maxRow =-1;
        for (int i = 0; i < seatingPlan.length; i++) {
            int temp = 0;


            for (int j = 0; j <seatingPlan[i].length ; j++) {
                if(seatingPlan[i][j] == 1){
                    count++;
                    temp++;
                }
            }
            if(temp > sumRow){ // compare the previous sum with the current sum
                sumRow = temp;// store the previous sum
                maxRow = i; // if the current sum is greater than the previous sum, store the row number
            }
        }
        System.out.println("Number of occupied seats: " + count);
        System.out.println("Row with the most occupied seats: " + maxRow + " occupied: " + sumRow);

    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[][]seatingPlan = initializeSeatingPlan(rand.nextInt(5,10), rand.nextInt(1, 10));
        System.out.println("Seating Plan: ");
        for (int i = 0; i < seatingPlan.length; i++) {
            for (int j = 0; j < seatingPlan[i].length; j++) {
                System.out.print(seatingPlan[i][j] + " ");
            }
            System.out.println();
        }
        analyzeSeating(seatingPlan);
    }
}
