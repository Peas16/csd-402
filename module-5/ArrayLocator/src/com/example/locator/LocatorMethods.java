// Paul Fralix, 09/03/2025 Module 5 Assignment M5
// This class contains methods to locate the largest and smallest elements in 2D arrays of both int and double types.

package com.example.locator;

public class LocatorMethods {

    // Locate largest in double[][]
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate largest in int[][]
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate smallest in double[][]
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate smallest in int[][]
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[][] sampleIntArray = {
            {3, 5, 1},
            {7, 2, 9},
            {4, 6, 0}
        };

        double[][] sampleDoubleArray = {
            {3.5, 5.1, 1.2},
            {7.3, 2.8, 9.9},
            {4.4, 6.6, 0.0}
        };

        int[] largestIntLoc = locateLargest(sampleIntArray);
        int[] smallestIntLoc = locateSmallest(sampleIntArray);
        int[] largestDoubleLoc = locateLargest(sampleDoubleArray);
        int[] smallestDoubleLoc = locateSmallest(sampleDoubleArray);

        System.out.println("Largest int at: [" + largestIntLoc[0] + ", " + largestIntLoc[1] + "]");
        System.out.println("Smallest int at: [" + smallestIntLoc[0] + ", " + smallestIntLoc[1] + "]");
        System.out.println("Largest double at: [" + largestDoubleLoc[0] + ", " + largestDoubleLoc[1] + "]");
        System.out.println("Smallest double at: [" + smallestDoubleLoc[0] + ", " + smallestDoubleLoc[1] + "]");
    }
}