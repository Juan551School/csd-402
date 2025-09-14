//Juan Macias Vasquez
//Bellevue University 
//CSD402-H323 Java for Programmers (2261-DD)
//Jack Lusby
//September 13th, 2025
//Uses FanClass.java to run 



package fanProject;

import java.util.ArrayList;
import java.util.List;

public class UseFans {

    // The Method to display details of a single Fan (no toString)
    public static void displayFan(FanClass fan) {
        System.out.println("Fan Details:");
        System.out.println(" Speed: " + fan.getSpeed());
        System.out.println(" On: " + fan.isOn());
        System.out.println(" Radius: " + fan.getRadius());
        System.out.println(" Color: " + fan.getColor());
        System.out.println();
    }

    // The Method to display details of a collection of Fans (no toString)
    public static void displayFans(List<FanClass> fans) {
        int count = 1;
        for (FanClass fan : fans) {
            System.out.println("Fan #" + count + ":");
            System.out.println(" Speed: " + fan.getSpeed());
            System.out.println(" On: " + fan.isOn());
            System.out.println(" Radius: " + fan.getRadius());
            System.out.println(" Color: " + fan.getColor());
            System.out.println();
            count++;
        }
    }

    // Main test code
    public static void main(String[] args) {
        // Create a collection of Fan instances
        List<FanClass> fanList = new ArrayList<>();

        // Fan 1
        FanClass fan1 = new FanClass();
        fan1.setSpeed(FanClass.FAST);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("blue");

        // Fan 2
        FanClass fan2 = new FanClass();
        fan2.setSpeed(FanClass.MEDIUM);
        fan2.setOn(false);
        fan2.setRadius(7.5);
        fan2.setColor("red");

        // Fan 3
        FanClass fan3 = new FanClass();
        fan3.setSpeed(FanClass.SLOW);
        fan3.setOn(true);
        fan3.setRadius(6);
        fan3.setColor("green");

        // Add to the collection
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Display only a single fan
        System.out.println("=== Displaying a Single Fan ===");
        displayFan(fan1);

        // Display all fans in collection
        System.out.println("=== Displaying All Fans ===");
        displayFans(fanList);
    }
}
