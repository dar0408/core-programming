// Write a program to find the side of the square whose parameter you read from user 
// Hint => Perimeter of Square is 4 times side
// I/P => perimeter
// O/P => The length of the side is ___ whose perimeter is ____


import java.util.Scanner;

public class SideSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the perimeter of the square
        System.out.println("Enter the perimeter of the square: ");
        float perimeter = sc.nextFloat();

        // Calculating the side length of the square
        float side = perimeter / 4; // Since a square has 4 equal sides

        // Displaying the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
