package Paper2019;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String genome = " ";

        int count = 0;
        while(!genome.equalsIgnoreCase("quit")){
            System.out.println("Enter genome string [quit to stop]");
            genome = scan.next();
            String[] Genome = genome.split("ATG");
            for (String s : Genome) {
                String[] parts = s.split("TAG|TAA|TGA"); // split the string
                if (parts.length == 0) { // if the length is 0 then increment the count
                    count++;
                } else if (parts.length > 1 || !parts[0].equals(s)) { // check if the split happens
                    char[] charArray = parts[0].toCharArray(); // convert the string to char array
                    if (charArray.length % 3 != 0) { // check if the length is divisible by 3
                        System.out.println("no gene found");
                    } else {
                        for (char c : charArray) {
                            System.out.print(c);// print the char array
                        }
                        System.out.println();

                    }
                } else {
                    count++; // if split didn't occur increment the count
                }
            }
            if(count == Genome.length){ // no split occur
                System.out.println("No gene found");
            }
            count = 0; // reset the count
        }
    }

}
