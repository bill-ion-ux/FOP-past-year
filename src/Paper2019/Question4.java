package Paper2019;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question4 {
    public static void main(String[] args) {
        String filepath = "myAmbition.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filepath)) ){
            String line;
            while((line = br.readLine()) != null){
                String[] parts = line.split("\\.");
                System.out.println("Number of sentence : " + parts.length);
                String[] words = line.split(" ");
                System.out.println("Number of Words : " + words.length);
                int[] character = new int[26];
                for(int i = 0 ; i < words.length ; i++){
                    for (int j = 0; j < words[i].length(); j++) {
                        words[i] = words[i].toUpperCase();
                        int index = (int)words[i].charAt(j) - (int)'A';
                        if(index < 0){
                            break;
                        }
                        character[index]++;
                    }
                }
                for (int i = 0; i < character.length; i++) {
                    System.out.print((char)(i + 'A') + " : " + character[i] + "  ");
                    if((i + 1) % 8 == 0){
                        System.out.println("");
                    }
                }

            }
        }catch(IOException e){
            System.out.println("file is not found");
        }
    }
}
