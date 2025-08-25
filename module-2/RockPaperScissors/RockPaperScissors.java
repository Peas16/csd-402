// Paul Fralix, 08/24/2025 Module 2 Assignment M2
// Rock Paper Scissors Game

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Computer generates a random number between 1 and 3
        int computerChoice = random.nextInt(3) + 1;

        // Prompt the user for their choice
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");
        int userChoice = input.nextInt();

        // Display choices
        System.out.println("Computer chose: " + getChoiceName(computerChoice));
        System.out.println("You chose: " + getChoiceName(userChoice));

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else if (userChoice >= 1 && userChoice <= 3) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

        input.close();
    }

    // Method to return the name of the choice
    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid";
        }
    }
}
