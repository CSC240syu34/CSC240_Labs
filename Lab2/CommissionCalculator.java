import java.util.Scanner;

public class CommissionCalculator {
    private Auto autoPolicy;
    private Home homePolicy;
    private Life lifePolicy;
    private Scanner scanner;

    public CommissionCalculator() {
        autoPolicy = new Auto();
        homePolicy = new Home();
        lifePolicy = new Life();
        scanner = new Scanner(System.in);
    }

    public void Run() {
        int choice = 0;
        while (choice != 7) {
            System.out.println(
                "-----------------------------\n" +
                "Welcome to Parkland Insurance\n" +
                "-----------------------------\n" +
                "Enter any of the following:\n" +
                "1) Enter auto insurance policy information\n" +
                "2) Enter home insurance policy information\n" +
                "3) Enter life insurance policy information\n" +
                "4) Compute commission and print auto policy\n" +
                "5) Compute commission and print home policy\n" +
                "6) Compute commission and print life policy\n" +
                "7) Quit"
            );

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    enterAutoInfo();
                    break;
                case 2:
                    enterHomeInfo();
                    break;
                case 3:
                    enterLifeInfo();
                    break;
                case 4:
                    computeAndPrintAuto();
                    break;
                case 5:
                    computeAndPrintHome();
                    break;
                case 6:
                    computeAndPrintLife();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private void enterAutoInfo() {
        System.out.print("Enter first name of insured: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name of insured: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter make of vehicle: ");
        String make = scanner.nextLine();
        System.out.print("Enter model of vehicle: ");
        String model = scanner.nextLine();
        System.out.print("Enter amount of liability: ");
        double liability = scanner.nextDouble();
        System.out.print("Enter amount of collision: ");
        double collision = scanner.nextDouble();
        scanner.nextLine();
        autoPolicy.setInfo(firstName, lastName, make + " " + model, liability, collision);
    }
    private void enterHomeInfo() {
        System.out.print("Enter first name of insured: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name of insured: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter house square footage: ");
        int footage = scanner.nextInt();
        System.out.print("Enter amount of dwelling: ");
        int dwelling = scanner.nextInt();
        System.out.print("Enter amount of contents: ");
        int contents = scanner.nextInt();
        System.out.print("Enter amount of liability: ");
        int liability = scanner.nextInt();
        scanner.nextLine();
        homePolicy.setInfo(firstName, lastName, footage, dwelling, contents, liability);
    }
    private void enterLifeInfo() {
        System.out.print("Enter first name of insured: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name of insured: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter age of insured: ");
        int age = scanner.nextInt();
        System.out.print("Enter amount of term: ");
        int term = scanner.nextInt();
        scanner.nextLine();
        lifePolicy.setInfo(firstName, lastName, age, term);
    }
    private void computeAndPrintAuto() {
        autoPolicy.computeCommission();
        System.out.println(autoPolicy);
    }

    private void computeAndPrintHome() {
        homePolicy.computeCommission();
        System.out.println(homePolicy);
    }

    private void computeAndPrintLife() {
        lifePolicy.computeCommission();
        System.out.println(lifePolicy);
    }
}