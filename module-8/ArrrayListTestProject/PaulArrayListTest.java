// Paul Fralix 09/18/2025 Module 8 Assignment M8

import java.util.ArrayList;
import java.util.Scanner;

public class PaulArrayListTest {

    // Method to find the maximum value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer maxValue = list.get(0);
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop and include 0):");

        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                numbers.add(input);
                if (input == 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        // Call the max method and display the result
        Integer largest = max(numbers);
        System.out.println("The largest value entered is: " + largest);

        scanner.close();
    }
}