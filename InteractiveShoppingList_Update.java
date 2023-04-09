package InteractiveShoppingList_Update;

import java.util.ArrayList;
import java.util.Scanner;

public class InteractiveShoppingList_Update {

    // Add an item to the list
    public static void addItem(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the item to add to the list: ");
        String item = scanner.nextLine();
        list.add(item);
    }

    // Remove an item from the list
    public static void removeItem(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the item to remove from the list: ");
        String item = scanner.nextLine();
        if (list.contains(item)) {
            list.remove(item);
        } else {
            System.out.println(item + " is not on the list.");
        }
    }

    // Find an item in the list
    public static void findItem(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item would you like to find in the list? ");
        String item = scanner.nextLine();
        if (list.contains(item)) {
            int index = list.indexOf(item);
            System.out.println(item + " found on the list at index " + (index + 1) + ".");
        } else {
            System.out.println(item + " is not on the list.");
        }
    }

    // Print the items in the list
    public static void printList(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("List of items:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        // Create an empty list
        ArrayList<String> list = new ArrayList<>();

        // Display a welcome message
        System.out.println("Welcome to the list program!");

        // Sentinel-controlled loop
        while (true) {
            // Ask the user for their input
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nMenu: A)dd, R)emove, F)ind, P)rint, Q)uit: ");
            String userInput = scanner.nextLine().toUpperCase();

            // Add an item to the list
            if (userInput.equals("A")) {
                addItem(list);
            }
            // Remove an item from the list
            else if (userInput.equals("R")) {
                removeItem(list);
            }
            // Find an item in the list
            else if (userInput.equals("F")) {
                findItem(list);
            }
            // Print the items in the list
            else if (userInput.equals("P")) {
                printList(list);
            }
            // Quit the program
            else if (userInput.equals("Q")) {
                System.out.println("Thank you for using the list program!");
                break;
            }
            // Handle invalid input
            else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}