package L8.question1;

import L8.question2.Number;

public class test {
    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number(4);
        Number c = new Number(6,50);

        a.displayAllNumbers();
        a.displayEven();
        a.displayMax();
        a.displayMin();
        a.displayAverage();
        a.displayPrime();
        a.displaySquare();
        System.out.println();

        b.displayAllNumbers();
        b.displayEven();
        b.displayMax();
        b.displayMin();
        b.displayAverage();
        b.displayPrime();
        b.displaySquare();
        System.out.println();
        c.displayAllNumbers();
        c.displayEven();
        c.displayMax();
        c.displayMin();
        c.displayAverage();
        c.displayPrime();
        c.displaySquare();


    }
}
