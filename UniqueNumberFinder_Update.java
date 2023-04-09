package UniqueNumberFinder_Update;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueNumberFinder_Update {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter 10 numbers separated by spaces
        System.out.print("Please enter 10 numbers: ");
        String input = scanner.nextLine();

        // Extract the numbers from the input and convert them to integers
        String[] numbers = input.split(" ");
        if (numbers.length != 10) {
            System.out.println("Error: you must enter exactly 10 numbers");
            System.exit(1);
        }
        List<Integer> nums = new ArrayList<>();
        for (String number : numbers) {
            nums.add(Integer.parseInt(number));
        }

        // Create a new list containing only the unique numbers
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int num : nums) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        // Display the unique numbers
        System.out.print("The numbers are: ");
        for (int i = 0; i < uniqueNumbers.size(); i++) {
            System.out.print(uniqueNumbers.get(i) + " ");
        }
        System.out.println();
    }
}