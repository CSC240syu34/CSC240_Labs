import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter positive integer as numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter positive integer as denominator: ");
            int denominator = scanner.nextInt();

            if (numerator <= 0 || denominator <= 0) {
                throw new IllegalArgumentException("both numerator and denominator must be positive integers");
            }

            RationalNumber rationalNumber = new RationalNumber(numerator, denominator);
            int gcd = rationalNumber.findCommonDenom();

            System.out.println("Greatest common denominator of " + numerator + "/" + denominator + " is " + gcd);
        } catch (Exception e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
