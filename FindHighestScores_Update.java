package FindHighestScores_Update;

import java.util.Scanner;

public class FindHighestScores_Update {

	public static void main(String[] args) {
		// Ask the user to enter the number of students
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of students: ");
		int numStudents = input.nextInt();
		
		// Initialize the highest and second highest scores
	    int highestScore = 0;
	    int secondHighestScore = 0;

	    // Ask the user for the scores of each student and update the highest and second highest scores
	    for (int i = 0; i < numStudents; i++) {
	        while (true) {
	            try {
	                System.out.printf("Please enter the score for student %d: ", i+1);
	                int score = input.nextInt();
	                if (score < 0) {
	                    throw new IllegalArgumentException();
	                }
	                if (score > highestScore) {
	                    secondHighestScore = highestScore;
	                    highestScore = score;
	                } else if (score > secondHighestScore) {
	                    secondHighestScore = score;
	                }
	                break;
	            } catch (IllegalArgumentException e) {
	                System.out.println("Invalid input. Please enter a non-negative integer.");
	            }
	        }
	    }

	    // Display the highest and second highest scores to the user
	    System.out.printf("The highest score is %d.%n", highestScore);
	    System.out.printf("The second highest score is %d.%n", secondHighestScore);
	}
}
