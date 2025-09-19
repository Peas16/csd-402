// Paul Fralix 09/18/2025 Module 9 Assignment M9
// This program creates an ArrayList of Strings, displays them, and allows the user to select

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayListViewer {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Populate the ArrayList with at least 10 Strings
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");
        words.add("Elderberry");
        words.add("Fig");
        words.add("Grape");
        words.add("Honeydew");
        words.add("Kiwi");
        words.add("Lemon");

        // Display the list using a for-each loop
        System.out.println("Here are the elements in the list:");
        for (String word : words) {
            System.out.println(word);
        }

        // Ask user which element they want to see again
        System.out.print("\nEnter the index of the element you'd like to see again (0–9): ");
        String input = scanner.nextLine();

        try {
            // Autoboxing: converting String input to Integer
            Integer index = Integer.parseInt(input); // Auto-unboxing when used as int
            System.out.println("Element at index " + index + ": " + words.get(index));
        } catch (Exception e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        scanner.close();
    }
}