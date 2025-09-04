// Paul Fralix 09/03/2025 Module 6 Assignment M6

package fanmodel;

public class FanTest {
    public static void main(String[] args) {
        // Fan using default constructor
        Fan defaultFan = new Fan();
        System.out.println("Default Fan: " + defaultFan);

        // Fan using argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10.5, "blue");
        System.out.println("Custom Fan: " + customFan);

        // Demonstrate setters
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setOn(true);
        defaultFan.setRadius(8.0);
        defaultFan.setColor("green");

        System.out.println("Updated Default Fan: " + defaultFan);

        // Demonstrate getters
        System.out.println("Custom Fan Speed: " + customFan.getSpeed());
        System.out.println("Custom Fan Status: " + (customFan.isOn() ? "On" : "Off"));
        System.out.println("Custom Fan Radius: " + customFan.getRadius());
        System.out.println("Custom Fan Color: " + customFan.getColor());
    }
}