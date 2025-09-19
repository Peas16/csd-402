// Paul Fralix 09/18/2025 Module 9 Assignment M9
// This program writes 10 random numbers to a file and then reads and displays the file contents

import java.io.*;
import java.util.Random;

public class FileNumberWriter {
    public static void main(String[] args) {
        String filename = "data.file";
        File file = new File(filename);
        Random rand = new Random();

        // Write or append 10 random numbers
        try (FileWriter writer = new FileWriter(file, true)) {
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(100); // Random number between 0–99
                writer.write(num + " ");
            }
            writer.write("\n"); // Optional: newline for clarity
            System.out.println("10 random numbers written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read and display the file contents
        System.out.println("\nContents of " + filename + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}