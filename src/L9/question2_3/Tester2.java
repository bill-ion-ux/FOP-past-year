package L9.question2_3;

public class Tester2 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("azmi","male","13-03-2002");
        lecturer.loadFile();
        lecturer.displayLecturerInfo();
    }
}
