package L9.question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Student extends PersonProfile{
    private final String fileName;
    List<Course> courses; // create a list for object class course
    //the class encapsulates the related data together
    //List is an interface and initialize it with ArrayList
    //List is like the blueprint
    public Student(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        this.courses = new ArrayList<>();
        this.fileName = fileName;
        loadCourse();
    }
    public void loadCourse(){
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String courseCode;
            while((courseCode = br.readLine()) != null){// read course code
                String courseName =  br.readLine(); // read course name
                int year = Integer.parseInt(br.readLine()); //read year
                int semester = Integer.parseInt(br.readLine()); //read semester
                int mark = Integer.parseInt(br.readLine()); // read mark
                courses.add(new Course(courseName,courseCode,year,semester,mark));

            }

        }catch (Exception e){
            System.out.println("Error loading courses: " + e.getMessage());
        }
    }
    public String getGrade(int mark){
        if (mark >= 85) return "A";
        if (mark >= 75) return "A-";
        if (mark >= 70) return "B+";
        if (mark >= 65) return "B";
        if (mark >= 60) return "B-";
        if (mark >= 55) return "C+";
        if (mark >= 50) return "C";
        if (mark >= 45) return "D";
        if (mark >= 35) return "E";
        return "F";
    }

    public void displayStudentInfo(){
        display();
        System.out.println("\nCourse details");
        for (Course course : courses){
            System.out.println("  " + course.courseName + " (" + course.courseCode + ") - Year " +
                    course.year + ", Semester " + course.semester + ": Mark " + course.mark +
                    " - Grade " + getGrade(course.mark));
        }
    }
}
