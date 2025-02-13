// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
// Hint => NA
// I/P => unitPrice, quantity
// O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking unit price as input
        System.out.print("Enter the unit price of the item: ");
        while (!sc.hasNextFloat()) {
            System.out.println("Invalid input! Please enter a valid unit price.");
            sc.next(); // Clear the invalid input
        }
        float unitPrice = sc.nextFloat();

        // Taking quantity as input
        System.out.print("Enter the quantity of the item: ");
        while (!sc.hasNextFloat()) {
            System.out.println("Invalid input! Please enter a valid quantity.");
            sc.next(); // Clear the invalid input
        }
        float quantity = sc.nextFloat();

        // Calculate total price
        float totalPrice = unitPrice * quantity;

        // Display formatted output
        System.out.printf("The total purchase price is INR %.2f if the quantity is %.2f and unit price is INR %.2f%n", 
                          totalPrice, quantity, unitPrice);
        
        sc.close(); // Close the scanner to prevent memory leaks
    }
}
