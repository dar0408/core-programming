// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height
// I/P => base, height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner; // Imports the Scanner class for user input

public class AreaOFTriangle { // Defines the class AreaOFTriangle
    public static void main(String[] args) { // Main method, the entry point of the program
        double base, height; // Declares variables to store base and height of the triangle
        Scanner input = new Scanner(System.in); // Creates a Scanner object to take user input

        // Prompting user to enter the base of the triangle
        System.out.println("Enter the base of the triangle: ");
        base = input.nextDouble(); // Reads the base value from user input

        // Prompting user to enter the height of the triangle
        System.out.println("Enter the height of the triangle: ");
        height = input.nextDouble(); // Reads the height value from user input

        // Calculates the area of the triangle in square inches using the formula (1/2 * base * height)
        double areaInSquareInches = 0.5 * base * height;

        // Converts the area from square inches to square centimeters (1 square inch = 6.4516 square cm)
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

        // Displays the area in both square inches and square centimeters
        System.out.println("The area of the triangle in square inches is " + areaInSquareInches +
                " and in square centimeters is " + areaInSquareCentimeters);
    }
}
