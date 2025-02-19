// Write a program to calculate various trigonometric functions using Math class given an angle in degrees

import java.util.Scanner;

public class Trigonometric {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an angle in degrees
        System.out.println("Enter the angle in degrees: ");
        // Read the angle from user input
        double angle = sc.nextDouble();

        // Call the calculateTrigonometricFunctions method to calculate the trigonometric values
        double[] trigonometricFunctions = calculateTrigonometricFunctions(angle);

        // Output the results of the trigonometric functions
        System.out.println("The trigonometric functions for angle " + angle + " are: ");
        System.out.println("Sine: " + trigonometricFunctions[0]);
        System.out.println("Cosine: " + trigonometricFunctions[1]);
        System.out.println("Tangent: " + trigonometricFunctions[2]);
    }

    // Method to calculate sine, cosine, and tangent for a given angle in degrees
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Create an array to store the values of sine, cosine, and tangent
        double[] trigonometricFunctions = new double[3];

        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate the sine, cosine, and tangent of the angle and store them in the array
        trigonometricFunctions[0] = Math.sin(radians);
        trigonometricFunctions[1] = Math.cos(radians);
        trigonometricFunctions[2] = Math.tan(radians);

        // Return the array containing the trigonometric values
        return trigonometricFunctions;
    }
}



// Hint => 
// Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
// public double[] calculateTrigonometricFunctions(double angle)
