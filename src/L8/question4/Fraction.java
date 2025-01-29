package L8.question4;

public class Fraction {
    private int numerator, denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if(denominator != 0){
            this.denominator = denominator;
        }
    }

    public void displayFraction(){// just my own way to calculate gcd
        // better method : euclidean method using recursion
        int gcd = 1;
        int tempDeno = denominator;
        int tempNume = numerator;
        for (int i = 0; i < 10; i++) {
            for (int j = 2; j < 10 ; j++) {
                if(denominator % j == 0 && numerator % j == 0){
                    gcd *= j;
                    denominator = denominator/j;
                    numerator = numerator/j;
                    break;
                }
            }
        }
        System.out.println("The lowest for of the fraction is : " + tempNume/gcd + "/" + tempDeno/gcd);
    }
}
