public class MonetaryValue {
    private double amount;

    public MonetaryValue(double amount) {
        this.amount = amount;
    }
    public void computeBreakdown() {
        int remainingAmount = (int) Math.round(amount * 100);
        int tens = remainingAmount / 1000; 
        remainingAmount %= 1000;
        int fives = remainingAmount / 500;
        remainingAmount %= 500;
        int ones = remainingAmount / 100;
        remainingAmount %= 100;
        int quarters = remainingAmount / 25;
        remainingAmount %= 25;
        int dimes = remainingAmount / 10;
        remainingAmount %= 10;
        int nickels = remainingAmount / 5;
        remainingAmount %= 5;
        int pennies = remainingAmount;

        System.out.println(tens + " ten dollar bills");
        System.out.println(fives + " five dollar bills");
        System.out.println(ones + " one dollar bills");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}
