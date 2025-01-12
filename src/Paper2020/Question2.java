package Paper2020;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.math.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Degree, Minute, Second;
        Degree = new int[4];
        Minute = new int[4];
        Second = new int[4];
        char[] Direction = new char[4];
        double[] LatiLong = new double[4];


        System.out.println("Enter Location 1");
        for (int i = 0; i <4 ; i++) {
            System.out.print("Enter Direction: [N/S/E/W] : ");
            Direction[i] = scan.next().charAt(0);
            System.out.print("Enter Degree, Minute, Second: ");
            Degree[i] = scan.nextInt();
            Minute[i] = scan.nextInt();
            Second[i] = scan.nextInt();
            double decimalDegree = Degree[i] + (double) (Minute[i] * 60 + (Second[i])) /3600;
            switch (Character.toUpperCase(Direction[i])){
                case 'N', 'E':
                    LatiLong[i] = decimalDegree;
                    break;
                case 'S', 'W':
                    LatiLong[i] = -decimalDegree;
                    break;
                default:
                    System.out.println("Invalid Direction");

            }
            if(i == 1){
                System.out.println("Enter Location 2");
            }
        }

            System.out.printf("Location 1 : " + "%.6f" + " latitude ,  " + "%.6f" + " longitude", LatiLong[0], LatiLong[1]);
            System.out.printf("\nLocation 2 : " + "%.6f" + " latitude , " + "%.6f" + " longitude", LatiLong[2], LatiLong[3]);
            double phi1 = Math.toRadians(LatiLong[0]);
            double phi2 = Math.toRadians(LatiLong[2]);
            double deltaLambda = Math.toRadians(LatiLong[1] - LatiLong[3]);
            double deltaPhi = Math.toRadians(LatiLong[0] - LatiLong[2]);
            double a = Math.pow(Math.sin((deltaPhi)/2),2) + Math.cos(phi1) * Math.cos(phi2) * Math.pow(Math.sin((deltaLambda)/2),2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
            double distance = 6371 * c;
            System.out.printf("\nDistance between Location 1 and Location 2 is : " + "%.2f" + " km", distance);
    }
}
