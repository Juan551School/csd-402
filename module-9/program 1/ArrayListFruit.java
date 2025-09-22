//Juan Macias Vasquez
//Bellevue University 
//CSD402-H323 Java for Programmers (2261-DD)
//Jack Lusby
//September 21st, 2025 Updated on September 13th, 2025

package arrayListString;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFruit {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Mango");
        words.add("Grape");
        words.add("Kiwi");
        words.add("Lemon");
        words.add("Lime");
        words.add("Strawberry");
        words.add("Dragon Fruit");

        // Print of all the elements using for-each loop
        System.out.println("ArrayList contents:");
        for (String word : words) {
            System.out.println(word);
        }

        // Ask user which element to display with the number starting at 0 
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index of the element you want to see again (0–9): ");
        String input = scanner.nextLine();

        try {
            // convert the string to an integer
            Integer indexObj = Integer.parseInt(input);
            // Integer -> int
            int index = indexObj;
            
            System.out.println("Element at index " + index + ": " + words.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }
}
