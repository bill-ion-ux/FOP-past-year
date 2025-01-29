package L8.question1;

public class BankAccount {
    private final String name;
    private final String IC;
    private int depositAmount;
    public BankAccount(String name, String IC, int depositAmount){
        this.depositAmount = depositAmount;
        this.name = name;
        this.IC = IC;
    }
    public void deposit(int amount){
        if(amount > 0) {
            depositAmount += amount;
            System.out.println("deposit successful");
            System.out.println("balance : " + depositAmount);
        }else{
            System.out.println("invalid!, enter deposit number again");
        }

    }
    public void withdraw(int amount){
        if(amount < depositAmount){
            depositAmount -= amount;
            System.out.println("balance: " + depositAmount);
            System.out.println("withdraw successful");
        }else{
            System.out.println("balance are not enough");
        }

    }
    public void displayBalance(){
        System.out.println("name :  " + name + ", IC/passport no: " + IC );
        System.out.println("Balance is " + depositAmount);
    }
}
