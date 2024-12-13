public class Food {
    private String name;
    private String foodGroup;
    private int calories;
    private double dailyPercentage;

    public Food(String name, String foodGroup, int calories, double dailyPercentage) {
        this.name = name;
        this.foodGroup = foodGroup;
        this.calories = calories;
        this.dailyPercentage = dailyPercentage;
    }

    public String getName() {
        return name;
    }
    public int getCalories() {
        return calories;
    }
    public double getDailyPercentage() {
        return dailyPercentage;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15d %-10.2f", name, foodGroup, calories, dailyPercentage);
    }
}
