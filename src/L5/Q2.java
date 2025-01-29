package L5;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // Array to store 10 unique random numbers
        Random random = new Random();
        int count = 0;

        while (count < 10) {
            int num = random.nextInt(21); // Generate a random number between 0 and 20
            boolean isDuplicate = false;

            // Check if the number is already in the array
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    isDuplicate = true;
                    break; // Exit the loop if a duplicate is found
                }
            }

            // If the number is not a duplicate, add it to the array
            if (!isDuplicate) {
                numbers[count] = num;
                count++; // Move to the next position in the array
            }
        }

        // Print the unique random numbers
        System.out.println("10 Non-Duplicate Random Numbers: " + Arrays.toString(numbers));
    }

}
