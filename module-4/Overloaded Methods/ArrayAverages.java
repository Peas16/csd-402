// Paul Fralix, 08/29/2025 Module 4 Assignment M4
public class ArrayAverages {

    // Method for short array
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short)(sum / array.length);
    }

    // Method for int array
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method for long array
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method for double array
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Test program
    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 15, 25, 35};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        System.out.println("📘 Short Array: " + arrayToString(shortArray));
        System.out.println("Average (short): " + average(shortArray));

        System.out.println("\n📗 Int Array: " + arrayToString(intArray));
        System.out.println("Average (int): " + average(intArray));

        System.out.println("\n📙 Long Array: " + arrayToString(longArray));
        System.out.println("Average (long): " + average(longArray));

        System.out.println("\n📕 Double Array: " + arrayToString(doubleArray));
        System.out.println("Average (double): " + average(doubleArray));
    }

    // Helper method to convert arrays to string
    public static String arrayToString(short[] array) {
        StringBuilder sb = new StringBuilder("[ ");
        for (short val : array) sb.append(val).append(" ");
        sb.append("]");
        return sb.toString();
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[ ");
        for (int val : array) sb.append(val).append(" ");
        sb.append("]");
        return sb.toString();
    }

    public static String arrayToString(long[] array) {
        StringBuilder sb = new StringBuilder("[ ");
        for (long val : array) sb.append(val).append("L ");
        sb.append("]");
        return sb.toString();
    }

    public static String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder("[ ");
        for (double val : array) sb.append(val).append(" ");
        sb.append("]");
        return sb.toString();
    }
}