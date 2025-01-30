package L8.question6;

public class Tester {
    public static void main(String[] args) {
        Burger stall1 = new Burger("ST001");
        Burger stall2 = new Burger("ST002");
        Burger stall3 = new Burger("ST003");

        // Simulate burgers sold at each stall
        stall1.sold(50);
        stall2.sold(30);
        stall3.sold(70);
        stall1.sold(20);
        stall2.sold(40);

        // Display the number of burgers sold by each stall
        stall1.displayStallInfo();
        stall2.displayStallInfo();
        stall3.displayStallInfo();

        // Display the total number of burgers sold across all stalls
        System.out.println("Total Burgers Sold in All Stalls: " + Burger.getTotalBurger());
    }
}
