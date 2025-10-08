/*
 Paul Fralix CSD-402 Assignment M12
 This program demonstrates method overloading by calculating the total cost of an auto service visit.
 */


public class AutoService {

    // Constants for standard charges
    static final double STANDARD_SERVICE_CHARGE = 150.00;
    static final double OIL_CHANGE_FEE = 40.00;
    static final double TIRE_ROTATION_FEE = 30.00;

    // Method 1: No parameters
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    // Method 2: One parameter (oil change fee)
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee;
    }

    // Method 3: Two parameters (oil change + tire rotation)
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationFee;
    }

    // Method 4: Three parameters (oil change + tire rotation - coupon)
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationFee - couponAmount;
    }

    // Main method to test each version twice
    public static void main(String[] args) {
        System.out.println("Testing yearlyService with no parameters:");
        System.out.println("Visit 1: $" + yearlyService());
        System.out.println("Visit 2: $" + yearlyService());

        System.out.println("\nTesting yearlyService with one parameter:");
        System.out.println("Visit 1: $" + yearlyService(OIL_CHANGE_FEE));
        System.out.println("Visit 2: $" + yearlyService(45.00)); // Custom oil change fee

        System.out.println("\nTesting yearlyService with two parameters:");
        System.out.println("Visit 1: $" + yearlyService(OIL_CHANGE_FEE, TIRE_ROTATION_FEE));
        System.out.println("Visit 2: $" + yearlyService(50.00, 35.00)); // Custom fees

        System.out.println("\nTesting yearlyService with three parameters:");
        System.out.println("Visit 1: $" + yearlyService(OIL_CHANGE_FEE, TIRE_ROTATION_FEE, 20.00));
        System.out.println("Visit 2: $" + yearlyService(50.00, 35.00, 25.00)); // Custom fees and coupon
    }
}