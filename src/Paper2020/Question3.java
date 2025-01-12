package Paper2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        String file ="raw.txt";
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count8 = 0;
        int count10 = 0;
        int[] mode;

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String part : parts) {
                    int number = Integer.parseInt(part);
                    if(number == 2){
                        count2++;
                    }else if(number == 4){
                        count4++;
                    }else if(number == 6){
                        count6++;
                    }else if(number == 8){
                        count8++;
                    }else if(number == 10){
                        count10++;
                    }
                }
            }
        }catch(IOException e){
            System.out.println("File not found");
        }
        //calculate mode
        mode = new int[]{count2, count4, count6, count8, count10};
        int[] maxNum = new int[]{2,4,6,8,10};
        int max = mode[0];
        //find the maximum frequency
        for (int i = 0; i < mode.length ; i++) {
            if (mode[i] > max) {
                max = maxNum[i];
            }
        }
        // collect all numbers with the maximum frequency
        List<Integer> modes = new ArrayList<>();
        for (int i = 0; i <mode.length ; i++) {
            if(mode[i] == max){
                modes.add(maxNum[i]);
            }
        }

        System.out.println("Frequency Distribution Table");
        System.out.println("2 : " + count2);
        System.out.println("4 : " + count4);
        System.out.println("6 : " + count6);
        System.out.println("8 : " + count8);
        System.out.println("10 : " + count10);
        if(modes.size() == 1){
            System.out.println("The mode of the dataset is : " + modes.get(0));
        }else{
            System.out.println("The modes of th dataset are : " + modes);
        }
    }
}
