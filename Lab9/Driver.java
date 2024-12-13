import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        LinkedList foodList = new LinkedList();

        try (Scanner fileScanner = new Scanner(new File("foods.txt"))) {
            while (fileScanner.hasNextLine()) {
                String[] parts = fileScanner.nextLine().split(" ");
                String name = parts[0];
                String foodGroup = parts[1];
                int calories = Integer.parseInt(parts[2]);
                double dailyPercentage = Double.parseDouble(parts[3]);
                foodList.append(new Food(name, foodGroup, calories, dailyPercentage));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open foods.txt");
            return;
        } catch (Exception e) {
            System.out.println("Cannot read foods.txt");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Welcome to Parkland Meal Selector");
            System.out.println("---------------------------------");
            System.out.println("1 - List food database");
            System.out.println("2 - Create meal by manual selection");
            System.out.println("3 - Create meal by random selection");
            System.out.println("4 - Remove foods high in calorie");
            System.out.println("5 - Exit");

            String input = scanner.nextLine();
            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        foodList.display();
                        break;

                    case 2:
                        System.out.println("Enter three food names:");
                        Food[] manualFoods = new Food[3];
                        for (int i = 0; i < 3; i++) {
                            while (true) {
                                System.out.print("Enter food name: ");
                                String foodName = scanner.nextLine();
                                if (foodList.contains(foodName)) {
                                    manualFoods[i] = foodList.get(foodName);
                                    break;
                                } else {
                                    System.out.println("Food " + foodName + " not in database, try again.");
                                }
                            }
                        }
                        displayMeal(manualFoods);
                        break;

                    case 3:
                        Food[] randomFoods = foodList.getRandomItems(3);
                        displayMeal(randomFoods);
                        break;

                    case 4:
                        System.out.print("Enter calorie limit: ");
                        int calorieLimit = scanner.nextInt();
                        scanner.nextLine();
                        foodList.removeAboveCalories(calorieLimit);
                        break;

                    case 5:
                        System.out.println("Exiting");
                        return;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
            }
        }
    }


    private static void displayMeal(Food[] foods) {
        int totalCalories = 0;
        double totalDailyPercentage = 0;

        System.out.println("===============================");
        System.out.println("Your selected meal");
        System.out.print("Foods: ");
        for (Food food : foods) {
            System.out.print(food.getName() + " ");
            totalCalories += food.getCalories();
            totalDailyPercentage += food.getDailyPercentage();
        }
        System.out.println();
        System.out.println("Total calorie count: " + totalCalories);
        System.out.println("Total daily percentage: " + (totalDailyPercentage * 100) + "%");
        System.out.println("===============================");
    }
}
