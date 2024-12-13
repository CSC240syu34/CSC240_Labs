import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a monetary value or type 'quit' to exit:");

        while (true) {
            try {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("quit")) {
                    break;
                }
                double amount = Double.parseDouble(input);

                if (amount < 0) {
                    System.out.println("Enter a positive amount.");
                    continue;
                }

                MonetaryValue monetaryValue = new MonetaryValue(amount);
                monetaryValue.computeBreakdown();

            } catch (NumberFormatException e) {
                System.out.println("EXCEPTION: Invalid input");
            }
        }

        scanner.close();
    }
}
