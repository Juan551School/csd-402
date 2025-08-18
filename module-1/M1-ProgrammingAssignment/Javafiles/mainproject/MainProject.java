package mainproject;
import java.util.Scanner;

public class MainProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for water amount
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Ask the user for initial temperature
        System.out.print("Enter the initial temperature of the water (°C): ");
        double initialTemperature = input.nextDouble();

        // Ask the user for the final temperature
        System.out.print("Enter the final temperature of the water (°C): ");
        double finalTemperature = input.nextDouble();

        // Calculate energy using the formula Q = waterMass * (finalTemperature - initialTemperature) * 4184
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy needed to heat the water is " + energy + " Joules.");

        input.close();
    }
}

