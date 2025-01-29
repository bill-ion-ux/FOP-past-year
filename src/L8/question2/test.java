package L8.question2;

import L8.question1.BankAccount;

public class test {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("nabil","050313030143",3000);
        ba.deposit(40000);
        ba.withdraw(300);
    }
}
