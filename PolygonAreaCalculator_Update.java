package PolygonAreaCalculator_Update;

import java.util.Scanner;

public class PolygonAreaCalculator_Update {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of sides
        System.out.print("Please enter the number of sides: ");
        int number = scanner.nextInt();

        // Ask the user for the length of the sides
        System.out.print("Please enter the length of the sides: ");
        double sideLength = scanner.nextDouble();

        // Calculate the area using the number of sides and side length
        double area = (number * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / number));

        // Print the area on screen for the user
        System.out.printf("The area of the polygon is %.2f%n", area);
    }
}

