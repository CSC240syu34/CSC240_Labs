public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator cant be 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public int findCommonDenom() {
        return gcd(Math.abs(numerator), Math.abs(denominator));
    }
}