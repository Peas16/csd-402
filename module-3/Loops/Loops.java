/*
 Paul Fralix, 08/24/2025, Module 3 Assignment M3
 Nested Loops Pattern
*/
public class Loops {
    public static void main(String[] args) {
        int rows = 7;

        // First, calculate the maximum width of the last row (excluding @)
        StringBuilder maxRow = new StringBuilder();
        for (int j = 0; j < rows; j++) {
            maxRow.append((int) Math.pow(2, j)).append(" ");
        }
        for (int j = rows - 2; j >= 0; j--) {
            maxRow.append((int) Math.pow(2, j)).append(" ");
        }
        int maxWidth = maxRow.length();

        // Now print each row with padding so @ aligns
        for (int i = 1; i <= rows; i++) {
            StringBuilder line = new StringBuilder();

            // Add leading spaces for pyramid shape
            for (int s = 0; s < (rows - i) * 3; s++) {
                line.append(" ");
            }

            // Left side of pyramid
            for (int j = 0; j < i; j++) {
                line.append((int) Math.pow(2, j)).append(" ");
            }

            // Right side of pyramid
            for (int j = i - 2; j >= 0; j--) {
                line.append((int) Math.pow(2, j)).append(" ");
            }

            // Pad with spaces to align @ symbol
            while (line.length() < maxWidth) {
                line.append(" ");
            }

            // Add @ symbol
            line.append("@");

            // Print the final line
            System.out.println(line.toString());
        }
    }
}