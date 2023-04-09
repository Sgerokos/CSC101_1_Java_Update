package SSNValidation_Update;

import java.util.Scanner;

public class SSNValidation_Update {

	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a social security number
        System.out.print("Please enter a Social Security Number: ");
        String ssn = scanner.nextLine();

        // Variable to verify the number
        boolean isValidSsn = true;

        // Check if the SSN is valid
        if (ssn.length() != 11) {
            // If length is not 11, it is invalid
            isValidSsn = false;
        } else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
            // If the dashes are not at the correct places, it is invalid
            isValidSsn = false;
        } else if (!(isDigits(ssn.substring(0, 3)) && isDigits(ssn.substring(4, 6)) && isDigits(ssn.substring(7)))) {
            // If the numeric parts do not consist of numbers, it is invalid
            isValidSsn = false;
        }

        // Print the result
        if (isValidSsn) {
            System.out.println(ssn + " is a valid SSN");
        } else {
            System.out.println(ssn + " is an invalid SSN");
        }
    }

    // Helper method to check if a string consists only of digits
    public static boolean isDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}