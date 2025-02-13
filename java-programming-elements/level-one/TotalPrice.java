// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
// Hint => NA
// I/P => unitPrice, quantity
// O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR __

import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        double unitPrice, quantity;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the unit price of the item: ");
        unitPrice = input.nextDouble();

        System.out.println("Enter the quantity of the item: ");
        quantity = input.nextDouble();

        // Calculate the total purchase price using the formula: totalPrice = unitPrice * quantity
        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + 
                " if the quantity is " + quantity + 
                " and unit price is INR " + unitPrice);
    }
}
