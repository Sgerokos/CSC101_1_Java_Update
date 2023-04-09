package InvestmentCalculator_Updated;

import java.util.Scanner;

public class InvestmentCalculator_Updated {

	public static void main(String[] args) {
		
		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user for the investment amount, annual interest rate, and number of years to invest
		System.out.print("Please enter the investment amount: ");
		double investmentAmount = scanner.nextDouble();
		System.out.print("Please enter the annual interest rate as a decimal: ");
		double annualInterestRate = scanner.nextDouble();
		System.out.print("Please enter the number of years to invest: ");
		int numYears = scanner.nextInt();
		
		// Validate the user's input
		if (investmentAmount < 0 || annualInterestRate < 0 || numYears < 0) {
			System.out.println("Invalid input. Please enter non-negative values.");
		} else {
			// Calculate the future investment value using the compound interest formula
			// FV = P * (1 + r/n)^(n*t), where:
			// FV = future investment value
			// P = investment amount
			// r = annual interest rate
			// n = number of times compounded per year (default is 12)
			// t = number of years invested
			int n = 12;  // Default compounding frequency is monthly
			double futureInvestmentValue = investmentAmount * Math.pow(1 + (annualInterestRate / n), n * numYears);
			
			// Format and print the result to the user
			String formattedResult = "$%,.2f after %d years of investing at an annual interest rate of %.2f%%";
			System.out.printf("The accumulated value is: " + formattedResult, futureInvestmentValue, numYears, annualInterestRate * 100);
		}

	}
}
