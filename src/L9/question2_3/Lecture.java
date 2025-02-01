package L9.question2_3;

public class Lecture {
     String courseName;
     String courseCode;
     int semester, session, creditHour,numStudent;
     int year;

    public Lecture(String courseName, String courseCode, int session, int semester, int creditHour, int numStudent) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.semester = semester;
        this.session = session;
        this.creditHour = creditHour;
        this.numStudent = numStudent;
    }
}
