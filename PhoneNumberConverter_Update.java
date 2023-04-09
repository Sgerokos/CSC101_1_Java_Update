package PhoneNumberConverter_Update;

import java.util.Scanner;

public class PhoneNumberConverter_Update {

    // Return the number associated with an alphabet
    public static int getNum(char uppercaseLetter) {
        String[] numMap = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        // Loop through each inner tuple
        for (int i = 0; i < numMap.length; i++) {
            // Check if alphabet is equal to alphabet passed
            if (numMap[i].indexOf(uppercaseLetter) != -1) {
                // Return the associated number
                return i + 2;
            }
        }

        return -1;
    }

    // Get the new phone number
    public static String letterToNum(String word) {
        // Get numbers associated with letters using StringBuilder
        StringBuilder phoneNumber = new StringBuilder();
        for (char letter : word.toCharArray()) {
            phoneNumber.append(getNum(Character.toUpperCase(letter)));
        }
        return phoneNumber.toString();
    }

    public static void main(String[] args) {
        // Ask the user to input a phone number with or without dashes, then read the input and split
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a phone number with or without dashes: ");
        String input = scanner.nextLine();
        String[] phoneNum = input.split("-");

        String phoneNumber;
        // Look to see if it contains the symbol
        if (phoneNum.length == 3) {
            // Format the phone number with dashes
            String areaCode = phoneNum[0];
            String exchangeCode = phoneNum[1];
            String remainingDigits = phoneNum[2];
            phoneNumber = areaCode + "-" + exchangeCode + "-" + letterToNum(remainingDigits);
        } else {
            // Format the phone number without dashes
            phoneNumber = phoneNum[0].substring(0, 3) + "-" + phoneNum[0].substring(3, 6) + "-" + letterToNum(phoneNum[0].substring(6));
        }

        System.out.println(phoneNumber);
    }
}