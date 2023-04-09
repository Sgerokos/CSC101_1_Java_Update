package RockPaperScissorGame_Update;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame_Update {
	
	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userWins = 0;
        int computerWins = 0;

        while (userWins <= 2 && computerWins <= 2) {
            // Ask the user to choose one number from the given list and generate one number randomly for the computer
            System.out.print("scissors (0), rock (1), paper (2): ");
            int userChoice = scanner.nextInt();

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please choose again.");
                continue;
            }

            int computerChoice = random.nextInt(3);

            // Check who wins and increase the variable for user wins and computer wins
            // if both are the same it is a draw and won't increase for either
            if (userChoice == 0 && computerChoice == 1) {
                System.out.println("The computer is rock. You are scissors. You lost. Sorry.");
                computerWins += 1;
            } else if (userChoice == 1 && computerChoice == 0) {
                System.out.println("The computer is scissors. You are rock. You win. Congratulations!");
                userWins += 1;
            } else if (userChoice == 1 && computerChoice == 2) {
                System.out.println("The computer is paper. You are rock. You lost. Sorry.");
                computerWins += 1;
            } else if (userChoice == 2 && computerChoice == 1) {
                System.out.println("The computer is rock. You are paper. You win. Congratulations!");
                userWins += 1;
            } else if (userChoice == 2 && computerChoice == 0) {
                System.out.println("The computer is scissors. You are paper. You lost. Sorry.");
                computerWins += 1;
            } else if (userChoice == 0 && computerChoice == 2) {
                System.out.println("The computer is paper. You are scissors. You win. Congratulations!");
                userWins += 1;
            } else if (userChoice == computerChoice) {
                String choice = userChoice == 0 ? "scissors" : userChoice == 1 ? "rock" : "paper";
                System.out.println("The computer is " + choice + ". You are " + choice + ". It is a draw.");
            }

            // Print the number of wins for user and computer
            System.out.println("The computer has won " + computerWins + " times.");
            System.out.println("You have won " + userWins + " times.");

            // Ask the user if they want to play again
            System.out.print("Do you want to play again? (y/n) ");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}