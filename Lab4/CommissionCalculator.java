import java.util.ArrayList;
import java.util.Scanner;

public class CommissionCalculator {
    private ArrayList<Policy> policies;
    private Scanner scanner;

    public CommissionCalculator() {
        policies = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void Run() {
        int choice = 0;
        while (choice != 5) {
            System.out.println(
                "-----------------------------\n" +
                "Welcome to Parkland Insurance\n" +
                "-----------------------------\n" +
                "Enter any of the following:\n" +
                "1) Enter auto insurance policy information\n" +
                "2) Enter home insurance policy information\n" +
                "3) Enter life insurance policy information\n" +
                "4) Print all sales entered\n" +
                "5) Quit"
            );

            choice = scanner.nextInt();
            scanner.nextLine();

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
                    printAllPolicies();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
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
        System.out.print("Enter model of vehicle: ");
        String model = scanner.nextLine();
        System.out.print("Enter amount of liability: ");
        double liability = scanner.nextDouble();
        System.out.print("Enter amount of collision: ");
        double collision = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        policies.add(new Auto(firstName, lastName, model, liability, collision));
    }

    private void enterHomeInfo() {
        System.out.print("Enter first name of insured: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name of insured: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter house square footage: ");
        int squareFootage = scanner.nextInt();
        System.out.print("Enter amount of dwelling coverage: ");
        int dwellingCoverage = scanner.nextInt();
        System.out.print("Enter amount of content coverage: ");
        int contentCoverage = scanner.nextInt();
        System.out.print("Enter amount of liability coverage: ");
        int liabilityCoverage = scanner.nextInt();
        scanner.nextLine();
        policies.add(new Home(firstName, lastName, squareFootage, dwellingCoverage, contentCoverage, liabilityCoverage));
    }

    private void enterLifeInfo() {
        System.out.print("Enter first name of insured: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name of insured: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter age of insured: ");
        int age = scanner.nextInt();
        System.out.print("Enter life coverage amount: ");
        int lifeCoverage = scanner.nextInt();
        scanner.nextLine();
        policies.add(new Life(firstName, lastName, age, lifeCoverage));
    }

    private void printAllPolicies() {
        System.out.println("\nList of Policies:");
        for (Policy policy : policies) {
            policy.computeCommission();
            System.out.println(policy);
        }
    }
}
