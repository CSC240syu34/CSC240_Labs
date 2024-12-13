import java.util.Random;

public class LinkedList {
    private Node head;

    private static class Node {
        Food food;
        Node next;

        Node(Food food) {
            this.food = food;
            this.next = null;
        }
    }

    public void append(Food food) {
        Node newNode = new Node(food);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        System.out.printf("%-20s %-15s %-15s %-10s\n", "Name", "Food Group", "Calories", "Daily Percentage");
        System.out.println("===============================================================");
        Node current = head;
        while (current != null) {
            System.out.println(current.food);
            current = current.next;
        }
    }
    public boolean contains(String foodName) {
        Node current = head;
        while (current != null) {
            if (current.food.getName().equalsIgnoreCase(foodName)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Food get(String foodName) {
        Node current = head;
        while (current != null) {
            if (current.food.getName().equalsIgnoreCase(foodName)) {
                return current.food;
            }
            current = current.next;
        }
        return null;
    }

    public Food[] getRandomItems(int count) {
        Random random = new Random();
        Food[] selectedFoods = new Food[count];
        int size = getSize();
        for (int i = 0; i < count; i++) {
            int index = random.nextInt(size);
            selectedFoods[i] = getByIndex(index);
        }
        return selectedFoods;
    }

    public int getSize() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private Food getByIndex(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.food;
            }
            count++;
            current = current.next;
        }
        return null;
    }

    public void removeAboveCalories(int calorieLimit) {
        while (head != null && head.food.getCalories() > calorieLimit) {
            head = head.next;
        }
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.food.getCalories() > calorieLimit) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
}
