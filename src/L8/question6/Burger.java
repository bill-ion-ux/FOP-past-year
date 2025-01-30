package L8.question6;

public class Burger {
    private int burgerCount;
    //we use static to make sure the variable are shared across all instance of the burger class
    //so there is only one copy of this variable
    private static int TotalBurger;
    private final String stallID;

    //constructor that take stallId as parameter and  initialize the burger count to 0
    public Burger(String stallID){
        this.burgerCount = 0;
        this.stallID = stallID;
    }
    public void sold(int num){
        burgerCount += num;
        TotalBurger += num;
    }
    public static int getTotalBurger(){
        return TotalBurger;
    }
    public void displayStallInfo(){
        System.out.println("Stall id: " + stallID + ", Burger Sold: " + burgerCount);
    }


}
