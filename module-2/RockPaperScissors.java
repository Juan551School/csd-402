package rockPaperScissors;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Generate the computers choice (1 = Rock, 2 = Paper, 3 = Scissors)
        int computerChoice = rand.nextInt(3) + 1;

        // Ask user for their choice
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: ");
        System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
        int userChoice = input.nextInt();

        // Display choices
        System.out.println("\nYou chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Result 
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        input.close();
    }

    // Convert the numbers into words 
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice"; // In case the user presses a wrong option 
        }
    }
}
