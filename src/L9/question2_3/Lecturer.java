package L9.question2_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Lecturer extends PersonProfile{
    List<Lecture> lecture;
    public Lecturer(String name, String gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);
        this.lecture = new ArrayList<>();
    }
    public void loadFile(){
        try(BufferedReader br = new BufferedReader(new FileReader("src/L9/txtFile/lecturer.txt"))){
            String courseName1 = "";
            while((courseName1 = br.readLine()) != null){
                String courseCode = br.readLine();
                int session = Integer.parseInt(br.readLine());
                int semester = Integer.parseInt(br.readLine());
                int creditHour = Integer.parseInt(br.readLine());
                int numStudent = Integer.parseInt(br.readLine());
                if(numStudent >= 150){
                    creditHour *= 3;
                } else if (numStudent >= 100) {
                    creditHour *= 2;
                }else if(numStudent >= 50){
                    creditHour = (int)((double)creditHour * 1.5);
                }
                lecture.add(new Lecture(courseName1,courseCode,session,semester,creditHour,numStudent));
            }
        }catch(Exception e){
            System.out.println("file not found");
        }
    }
    public void displayLecturerInfo(){
        display();
        System.out.println("course details ");
        for(Lecture lecture1 : lecture){
            System.out.println( lecture1.courseName + " (" + lecture1.courseCode + ") - Year " +
                    lecture1.session + "\nSemester : " + lecture1.semester + "\nCredit Hour : " + lecture1.creditHour +
                    "\nNumber of student : " + lecture1.numStudent);
            System.out.println();
        }
    }

}
