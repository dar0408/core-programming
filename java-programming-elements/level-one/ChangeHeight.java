// Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class ChangeHeight {
    public static void main(String[] args) {
        double height;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your height in centimeters: ");
        height = input.nextDouble();

        // Convert height from centimeters to feet (1 foot = 30.48 cm)
        double heightInFeet = height / 30.48;

        // Convert height from centimeters to inches (1 inch = 2.54 cm)
        double heightInInches = height / 2.54;

        System.out.println("Your height in cm is " + height +
                ", while in feet it is " + heightInFeet +
                " and in inches it is " + heightInInches);
    }
}
