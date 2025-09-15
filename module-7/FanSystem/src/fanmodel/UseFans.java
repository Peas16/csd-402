// Paul Fralix 09/14/2025 Module 7 Assignment M7

import java.util.ArrayList;

public class UseFans {

    // Method to display a single Fan without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("  Status: " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("  Speed: " + fan.getSpeed());
        System.out.println("  Radius: " + fan.getRadius());
        System.out.println("  Color: " + fan.getColor());
        System.out.println();
    }

    // Method to display a collection of Fans without using toString()
    public static void displayFanCollection(ArrayList<Fan> fans) {
        System.out.println("Displaying Fan Collection:");
        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1));
            displayFan(fans.get(i));
        }
    }

    // Main method to test functionality
    public static void main(String[] args) {
        // Create a collection of Fan instances
        ArrayList<Fan> fanList = new ArrayList<>();

        // Add Fans using both constructors
        fanList.add(new Fan()); // default
        fanList.add(new Fan(Fan.FAST, true, 10.0, "blue"));
        fanList.add(new Fan(Fan.MEDIUM, false, 8.5, "green"));
        fanList.add(new Fan(Fan.SLOW, true, 7.0, "red"));

        // Display all Fans
        displayFanCollection(fanList);
    }
}
