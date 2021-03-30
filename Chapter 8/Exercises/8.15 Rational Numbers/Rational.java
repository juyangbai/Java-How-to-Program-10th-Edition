package JuyangBai.Java;

import java.math.BigDecimal;

/*
private integer variables: numerator & denominator

coustructor 1: no-argument with default values
constructor 2: store the fraction in reduced form.

methods: public
1. Add two Rational numbers
2. Subtract two Rational numbers
3. Multiply two Rational numbers
4. Divide two Rational numbers
5. Return a String representation of a Rational number in the form a/b, where a is the
   numerator and b is the denominator
6. Return a String representation of a Rational number in floating-point format.
   (Consider providing formatting capabilities that enable the user of the class to specify the
   number of digits of precision to the right of the decimal point.)
 */

public class Rational{

    private int numerator;
    private int denominator;

    //Constructor
    //no-argument constructor
    public Rational()
    {
        this.numerator = 0;
        this.denominator = 1;
    }

    //store the fraction in reduced form
    //Question: why non-this.,the result is (0,0)
    public Rational(int numerator, int denominator)
    {
        //int greatestCommmonDivisor;
        if (numerator > denominator)
        {
            for (int i = denominator; i >= 2; i--)
            {
                if (numerator % i == 0 && denominator % i == 0)
                {
                    numerator = numerator / i;
                    denominator = denominator / i;
                }
            }
            this.numerator = numerator;
            this.denominator = denominator;
//            greatestCommmonDivisor = gcd(numerator, denominator);
//            this.numerator = numerator / greatestCommmonDivisor;
//            this.denominator = denominator / greatestCommmonDivisor;
        }

        if (numerator < denominator)
        {
            for (int i = numerator; i >= 2; i--)
            {
                if (numerator % i == 0 && denominator % i == 0)
                {
                    numerator = numerator / i;
                    denominator = denominator / i;
                }
            }
            this.numerator = numerator;
            this.denominator = denominator;
//            greatestCommmonDivisor = gcd(denominator, numerator);
//            this.numerator = numerator / greatestCommmonDivisor;
//            this.denominator = denominator / greatestCommmonDivisor;
        }

        if (numerator == denominator)
        {
            this.numerator = 1;
            this.denominator = 1;
        }
    }



    //Methods
    public static Rational Add(Rational addend1, Rational addend2)
    {
        return new Rational((addend1.numerator * addend2.denominator + addend2.numerator * addend1.denominator), (addend1.denominator * addend2.denominator));
    }

    public static Rational Subtract(Rational minuend, Rational subtrahend)
    {
        return new Rational((minuend.numerator * subtrahend.denominator - subtrahend.numerator * minuend.denominator), (minuend.denominator * subtrahend.denominator));
    }

    public static Rational Multiply(Rational added, Rational multiplier)
    {
        return new Rational((added.numerator * multiplier.numerator), (added.denominator * multiplier.denominator));
    }

    public static Rational Divide(Rational dividend, Rational divisor)
    {
        return new Rational((dividend.numerator * divisor.denominator),(dividend.denominator * divisor.numerator));
    }

    //Output
   public int getNumerator()
   {
       return numerator;
   }

   public int getDenominator()
   {
       return denominator;
   }

   public String toString()
   {
       return String.format("%d/%d", this.numerator,this.denominator);
   }

   //control the decimal
   public String toFloatingPoint(int digit)
   {
       double temp = (double)this.numerator/(double)this.denominator;
       BigDecimal decimal=new BigDecimal(temp);
       double res=decimal.setScale(digit,BigDecimal.ROUND_HALF_UP).doubleValue();
       return ("" + res);
   }

    //Euclidean algorithm: solve the greatest common divisor
//   private static int gcd(int a, int b)
//   {
//       if(b == 0)
//       {
//           return a;
//       }
//       return gcd(b, a % b);
//   }
}
