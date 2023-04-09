package GradeCalculator_Update;

import java.util.Scanner;

public class GradeCalculator_Update {

	 public static void main(String[] args) {
	        // Ask the user to input the name and grades of the student
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Please enter the student's name followed by the grades (separated by commas): ");
	        String studentInput = scanner.nextLine();
	        scanner.close();

	        // Split the grades into a list
	        String[] gradesList = studentInput.split(",");

	        // Make sure the input has exactly 6 elements (name + 5 grades)
	        if (gradesList.length != 6) {
	            System.out.println("Invalid input! Please enter the student's name followed by 5 grades.");
	        } else {
	            // Extract the grades and convert them to integers
	            int[] studentGrades = new int[5];
	            for (int i = 0; i < 5; i++) {
	                try {
	                    studentGrades[i] = Integer.parseInt(gradesList[i+1].trim());
	                } catch (NumberFormatException e) {
	                    System.out.println("Invalid input! Please enter integers for the grades.");
	                    return;
	                }
	            }

	            // Compute the total grade
	            int totalGrade = 0;
	            for (int grade : studentGrades) {
	                totalGrade += grade;
	            }

	            // Calculate the letter grade based on the total grade
	            String letterGrade;
	            if (totalGrade >= 90) {
	                letterGrade = "A";
	            } else if (totalGrade >= 80) {
	                letterGrade = "B";
	            } else if (totalGrade >= 70) {
	                letterGrade = "C";
	            } else if (totalGrade >= 60) {
	                letterGrade = "D";
	            } else {
	                letterGrade = "F";
	            }

	            // Print the student's name, grades, and letter grade
	            System.out.printf("%s's grades: %d, %d, %d, %d, %d. Letter grade: %s\n",
	                    gradesList[0], studentGrades[0], studentGrades[1],
	                    studentGrades[2], studentGrades[3], studentGrades[4],
	                    letterGrade);
	        
	    }
	}
}
