// Paul Fralix 08-17-2025 Module 1 Assignment
// This program calculates the energy needed to heat water based on user input.

package calculator.energy;

import java.util.Scanner;

public class WaterHeatingEnergyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for mass of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt user for initial temperature
        System.out.print("Enter the initial temperature (°C): ");
        double initialTemperature = input.nextDouble();

        // Prompt user for final temperature
        System.out.print("Enter the final temperature (°C): ");
        double finalTemperature = input.nextDouble();

        // Calculate energy using formula Q = mass * (finalTemp - initialTemp) * 4184
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display result
        System.out.println("\nThe energy needed is: " + energy + " joules.");

        // Contextual note
        System.out.println("\nNote: A joule is a derived unit of energy in the International System of Units. "
                + "It is equal to the energy transferred when a force of one newton acts "
                + "over a distance of one metre, or the energy dissipated as heat when "
                + "an electric current of one ampere passes through a resistance of one ohm "
                + "for one second. (Source: Wikipedia, 2024)");
    }
}


	


