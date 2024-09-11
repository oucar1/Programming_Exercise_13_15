import java.math.BigInteger;
import java.util.Scanner;

public class RationalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get first rational number
        System.out.print("Enter the first rational number (e.g., 3 454): ");
        BigInteger n1 = input.nextBigInteger();
        BigInteger d1 = input.nextBigInteger();
        Rational r1 = new Rational(n1, d1);

        // Get second rational number
        System.out.print("Enter the second rational number (e.g., 7 2389): ");
        BigInteger n2 = input.nextBigInteger();
        BigInteger d2 = input.nextBigInteger();
        Rational r2 = new Rational(n2, d2);

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r1 + " is " + r1.doubleValue());
    }
}
