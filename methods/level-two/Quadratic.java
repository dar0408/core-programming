// Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to input coefficients a, b, and c for the quadratic equation
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Print the result based on the number of roots
        if (roots.length == 0) {
            System.out.println("No real roots");  // If no real roots
        } else if (roots.length == 1) {
            System.out.println("Root: " + roots[0]);  // If one real root
        } else {
            System.out.println("Root 1: " + roots[0]);  // If two real roots
            System.out.println("Root 2: " + roots[1]);
        }
    }

    // Method to find the roots of the quadratic equation ax^2 + bx + c = 0
    static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta) to determine the nature of the roots
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, there are two distinct real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);  // First root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);  // Second root
            return new double[] {root1, root2};  // Return both roots
        } 
        // If delta is zero, there is one real root (repeated root)
        else if (delta == 0) {
            double root = -b / (2 * a);  // Single repeated root
            return new double[] {root};  // Return the root
        } 
        // If delta is negative, there are no real roots (complex roots)
        else {
            return new double[] {};  // Return an empty array to indicate no real roots
        }
    }
}



// Hint => 
// Take a, b, and c as input values to find the roots of x.
// The roots are computed using the following formulae
// delta = b2+ 4*a*c
// If delta is positive the find the two roots using formulae 
// root1 of x = (-b + delta)/(2*a) 
// root1 of x = (-b - delta)/(2*a)
// If delta is zero then there is only one root of x  
// root of x = -b/(2*a)
// If delta is negative return empty array or nothing 
// Write a Method to find find the roots of a quadratic equation and return the roots

