// Write a program to find the side of the square whose parameter you read from user 
// Hint => Perimeter of Square is 4 times side
// I/P => perimeter
// O/P => The length of the side is ___ whose perimeter is ____


import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        double perimeter;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculate the side length of the square using the formula: side = perimeter / 4
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
