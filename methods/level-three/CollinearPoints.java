// Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 


import java.util.Scanner;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for the three points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check if the points are collinear using slope formula
        if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        // Check if the points are collinear using the area of triangle formula
        if (areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the area of triangle formula.");
        } else {
            System.out.println("The points are not collinear using the area of triangle formula.");
        }
    }

    // Method to check if the points are collinear using the slope formula
    private static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the slopes between the points
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // The points are collinear if the slopes are equal
        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    // Method to check if the points are collinear using the area of triangle formula
    private static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // The points are collinear if the area is 0
        return area == 0;
    }
}



// Hint => 
// Take inputs for 3 points x1, y1, x2, y2, and x3, y3
// Write a Method to find the 3 points that are collinear using the slope formula. The 3 points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab, bc, and cd are equal. 
// slope AB = (y2 - y1)/(x2 - x1), slope BC = (y3 - y2)/(x3 - x3)
// slope AC = (y3 - y1)/(x3 - x1) Points are collinear if
// slope AB = slope BC = slope Ac
// The method to find the three points is collinear using the area of the triangle formula. The Three points are collinear if the area of the triangle formed by three points is 0. The area of a triangle is 
       

// area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))