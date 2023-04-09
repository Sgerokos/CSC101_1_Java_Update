package ArithmeticQuizMaster_Update;

import java.util.Random;
import java.util.Scanner;

public class ArithmeticQuizMaster_Update {

	public static void main(String[] args) {
	    // Declare and initialize required variables
	    int num_correct = 0;
	    int num_incorrect = 0;
	    int longest_streak = 0;
	    int current_streak = 0;
	    int max_incorrect = 3;
	    int test_time, answer, num1, num2;
	    long start_time, end_time;
	    boolean is_correct;
	    
	    // Create the random number generator and scanner objects
	    Random rand = new Random();
	    Scanner input = new Scanner(System.in);
	    
	    // Start the quiz and record the start time
	    start_time = System.currentTimeMillis();
	    
	    // Loop through 100 questions
	    for (int i = 0; i < 100; i++) {
	        // Generate two random integers
	        num1 = rand.nextInt(10);
	        num2 = rand.nextInt(10);

	        // Swap num1 and num2 if num1 is less than num2
	        if (num1 < num2) {
	            int temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }

	        // Prompt the user to answer num1 - num2
	        System.out.print("What is " + num1 + " - " + num2 + "? Enter -1 to quit. ");
	        try {
	            answer = input.nextInt();
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please enter a number.");
	            input.nextLine();
	            continue;
	        }
	        
	        if (answer == -1) {
	            break;
	        }

	        // Check if the answer is correct and display the result
	        if (num1 - num2 == answer) {
	            System.out.println("Your answer is correct!");
	            num_correct++;
	            is_correct = true;
	        } else {
	            System.out.println("Your answer is incorrect. " + num1 + " - " + num2 + " is " + (num1 - num2));
	            num_incorrect++;
	            is_correct = false;
	        }

	        // Update streaks
	        if (is_correct) {
	            current_streak++;
	            if (current_streak > longest_streak) {
	                longest_streak = current_streak;
	            }
	        } else {
	            current_streak = 0;
	        }

	        // Check if the quiz should end
	        if (num_incorrect == max_incorrect) {
	            System.out.println("You have reached " + max_incorrect + " incorrect answers. The quiz ends now.");
	            break;
	        }
	    }

	    // Calculate the total score and test time
	    end_time = System.currentTimeMillis();
	    test_time = (int) ((end_time - start_time) / 1000);
	    int total_score = num_correct + (longest_streak * 10);

	    // Print results for the user
	    System.out.println("\nThe total score is " + total_score);
	    System.out.println("Total correct answers: " + num_correct);
	    System.out.println("Total incorrect answers: " + num_incorrect);
	    System.out.println("The longest streak of correct answers: " + longest_streak);
	    System.out.println("The duration of the test: " + test_time + " seconds");

	    // Close the scanner object
	    input.close();
	}
}
