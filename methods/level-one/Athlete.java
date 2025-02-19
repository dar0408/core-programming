// An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
import java.util.Scanner;

public class Athlete {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the length of side 1
        System.out.println("Enter the length of side 1: ");
        // Read the value of side 1
        double side1 = sc.nextDouble();

        // Prompt the user to enter the length of side 2
        System.out.println("Enter the length of side 2: ");
        // Read the value of side 2
        double side2 = sc.nextDouble();

        // Prompt the user to enter the length of side 3
        System.out.println("Enter the length of side 3: ");
        // Read the value of side 3
        double side3 = sc.nextDouble();

        // Call the calculateRounds method to calculate the number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Output the result to the user
        System.out.println("The athlete needs to complete " + rounds + " rounds to complete a 5 km run");
    }

    // Method to calculate the number of rounds needed to complete 5 km
    public static double calculateRounds(double side1, double side2, double side3) {
        // Calculate the perimeter of the triangle (sum of all sides)
        double perimeter = side1 + side2 + side3;
        // Return the number of rounds needed to cover 5000 meters (5 km)
        return 5000 / perimeter;
    }
}


// Hint => 
// Take user input for 3 sides of a triangle 
// The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
// Write a Method to compute the number of rounds user needs to do to complete 5km run

