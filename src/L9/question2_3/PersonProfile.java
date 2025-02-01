package L9.question2_3;

public class PersonProfile {
    private final String gender;
    private final String name;
    private final String dateOfBirth;
    public PersonProfile(String name , String gender, String dateOfBirth){
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    public void display(){
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("Date of Birth: " + dateOfBirth);
    }


}
