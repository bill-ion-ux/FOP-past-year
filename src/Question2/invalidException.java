package Question2;

public class invalidException extends Exception {
    public invalidException(String message){
        super(message);
    }
    public static void checkAge(int age) throws invalidException{
        if(age < 18){
            throw new invalidException("Age is less than 18");
        }

    }
    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (invalidException e) {
            System.out.println(e.getMessage());
        }
    }

}
