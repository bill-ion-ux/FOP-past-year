package L7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        HashMap<String,String> course = new HashMap<>();



        try(BufferedReader br = new BufferedReader(new FileReader("course.txt"))){
            String courseCode = "";
            //read first line as coursecode
            while((courseCode = br.readLine()) != null){
                //read second line as course name
                String courseName = br.readLine();
                //read the next 3 line and do nothing, basically skip it
                //br.readline read the next line but doesn't store in any variable
                for (int i = 0; i < 3 && br.readLine() != null; i++) {
                    int num = i;
                    //do nothing can ignore this line
                }
                course.put(courseCode,courseName);
            }

        }catch (IOException e){
            System.out.println("file not found");
        }
        //use lambda expression to print the hashmap

        course.forEach((code,name) -> System.out.println(code + ": "+ code));
    }
}
