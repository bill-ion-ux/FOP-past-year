package L5;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int LiCount = 0;
        int BiCount = 0;
        int[] Numbers = new int[20];
        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = rand.nextInt(101);
        }
        System.out.println(" A list of 20 random integer within 0 to 100");
        System.out.println(Arrays.toString(Numbers));
        for (int i = 0; i < Numbers.length ; i++) {
            for (int j = i + 1; j < Numbers.length; j++) {
                int temp = Numbers[i];
                if(Numbers[j] > Numbers[i]){
                    Numbers[i] = Numbers[j];
                    Numbers[j] = temp;
                }
            }
        }
        System.out.println("Array in descending order : ");
        System.out.println(Arrays.toString(Numbers));
        System.out.println("Enter a number to search ");
        int num = sc.nextInt();
        // This is Linear Search
        for (int number : Numbers) {
            if (num == number) {
                System.out.println("Linear Search - " + LiCount + " Loops");
            } else {
                LiCount++;
            }
        }
        // This is Binary Search
        int low = 0;
        int high = 19;
        while(low <= high){
            int mid = (low + high)/2;
            if(num == Numbers[mid]){
                BiCount++;
                System.out.println("Binary Search - " + BiCount + " loops");
                break;
            }else if(num > Numbers[mid]){
                high = mid -1;
                BiCount++;
            }else{
                low = mid + 1;
                BiCount++;
            }
        }

    }
}
