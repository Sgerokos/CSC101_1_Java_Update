package BoxOrderCalculator_Update;

import java.util.Scanner;

public class BoxOrderCalculator_Update {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    // Import the math library
	    int quantity;
	    double amount;
	    String shipping, shipping_mode;

	    // Ask the user to enter the number of boxes they want to buy
	    while (true) {
	        try {
	            System.out.print("Please enter the number of boxes to buy (max 200): ");
	            quantity = Integer.parseInt(input.nextLine());
	            if (quantity <= 0 || quantity > 200) {
	                throw new NumberFormatException();
	            }
	            break;
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a number between 1 and 200.");
	        }
	    }

	    // Calculate the total cost
	    amount = quantity * 1.50;

	    // Ask the user for the shipping location
	    System.out.print("Please enter a shipping location (NY or other): ");
	    shipping = input.nextLine();

	    // If shipping is NY, add 8.75% for taxes
	    if (shipping.equalsIgnoreCase("NY")) {
	        amount += amount * 0.0875;
	    }

	    // Apply discount if quantity is greater than 50
	    if (quantity > 50) {
	        amount *= 0.8;
	    }

	    // Ask the user for the shipping mode
	    System.out.print("What type of shipping mode would you like? Please enter Air or Ground: ");
	    shipping_mode = input.nextLine();

	    // Estimate the price of the shipping mode
	    if (shipping_mode.equalsIgnoreCase("Air")) {
	        amount += 50;
	    } else {
	        amount += 10;
	    }

	    // Print the total amount
	    System.out.println("The total amount is: $" + String.format("%.2f", amount));
	}
}
