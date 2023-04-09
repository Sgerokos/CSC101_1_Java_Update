package PasswordChecker_Update;

import java.util.Scanner;

public class PasswordChecker_Update {
	
	/**
     * Checks if a password is valid based on the following requirements:
     * - At least 8 characters
     * - At least 2 digits
     * - A mix of letters and digits
     * 
     * @param password the password to check
     * @return true if the password is valid, false otherwise
     */
    public static boolean checkPassword(String password) {
        int countLetters = 0;
        int countDigits = 0;

        // Iterate through each character in the password
        for (char ch : password.toCharArray()) {
            // If the character is a digit, increment countDigits
            if (Character.isDigit(ch)) {
                countDigits++;
            }
            // If the character is alphabetic, increment countLetters
            else if (Character.isAlphabetic(ch)) {
                countLetters++;
            }
            // If the character is anything else, the password is invalid
            else {
                return false;
            }
        }

        // If the password meets the criteria, return true
        if (countDigits >= 2 && countLetters + countDigits >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Ask the user to enter a password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();

        // Check if the password is valid and print a message
        if (checkPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password. The password must be at least 8 characters long with at least 2 digits and a mix of letters and digits.");
        }
    }
}