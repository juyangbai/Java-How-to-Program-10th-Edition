package JuyangBai.Java;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rational rational0 = new Rational();
        Rational rational1 = new Rational(1,3);
        Rational rational2 = new Rational(1,2);

        System.out.println("No-argument constructor");
        System.out.printf("numerator: %d, denominator: %d",rational0.getNumerator(), rational0.getDenominator());
        System.out.println();
        System.out.println("Have-arguments constructor");
        System.out.printf("numerator: %d, denominator: %d",rational1.getNumerator(), rational1.getDenominator());
        System.out.println();
        System.out.printf("numerator: %d, denominator: %d",rational2.getNumerator(), rational2.getDenominator());
        System.out.println();


        Rational add = Rational.Add(rational1, rational2);
        Rational sub = Rational.Subtract(rational1, rational2);
        Rational muti = Rational.Multiply(rational1, rational2);
        Rational div =  Rational.Divide(rational1, rational2);

        //do not add the toString still output 5/6
        System.out.println("The result of two integers addition");
        System.out.println(add.toFloatingPoint(10));
        System.out.println("The result of two integers subtract");
        System.out.println(sub.toString());
        System.out.println("The result of two integers multiply");
        System.out.println(muti.toString());
        System.out.println("The result of two integers divided");
        System.out.println(div.toString());
    }
}
