// Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for numberOfStudents variable.
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Display the number of possible handshakes.


import java.util.Scanner;

public class MaxHandshake {
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes using the formula: n * (n - 1) / 2
        // This formula is derived from the combination formula C(n, 2), which counts unique pairs
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                " students is " + maximumHandshakes);
    }
}
