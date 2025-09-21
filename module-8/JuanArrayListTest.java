//Juan Macias Vasquez
//Bellevue University 
//CSD402-H323 Java for Programmers (2261-DD)
//Jack Lusby
//September 21st, 2025 Updated on September 13th, 2025

package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class JuanArrayListTest {

    // the method to find the maximum value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;  // return 0 if the list is empty
        }

        Integer largest = list.get(0);  // assume that the first element is the largest
        for (Integer num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest; //return the largest value that is displayed to the user
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop, 0 will be included):");

        while (true) {
            int input = scanner.nextInt();
            numbers.add(input); // add input to list
            if (input == 0) {
                break; // stop when user enters 0 and finish
            }
        }

        // check for the max
        Integer largest = max(numbers);

        // Display the result
        System.out.println("The largest number in the list is: " + largest);

        scanner.close();
    }
}

