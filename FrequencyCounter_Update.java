package FrequencyCounter_Update;

import java.util.Scanner;

public class FrequencyCounter_Update {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter integers between 1 and 100, separated by spaces: ");
		
		// Read input and filter valid integers
	    String[] numbers = input.nextLine().split(" ");
	    int[] n = new int[numbers.length];
	    int count = 0;
	    for (int i = 0; i < numbers.length; i++) {
	        try {
	            int num = Integer.parseInt(numbers[i]);
	            if (num >= 1 && num <= 100) {
	                n[count++] = num;
	            }
	        } catch (NumberFormatException e) {
	            // Ignore non-integer inputs
	        }
	    }

	    // Count the appearance of each integer
	    int[] appearanceCount = new int[100];
	    for (int i = 0; i < count; i++) {
	        appearanceCount[n[i] - 1]++;
	    }

	    // Print the appearance count of each integer
	    for (int i = 0; i < appearanceCount.length; i++) {
	        if (appearanceCount[i] == 1) {
	            System.out.printf("%d appears 1 time\n", i+1);
	        } else if (appearanceCount[i] > 1) {
	            System.out.printf("%d appears %d times\n", i+1, appearanceCount[i]);
	        }
	    }
	}
}