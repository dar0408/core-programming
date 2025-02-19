// Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()


import java.util.Scanner;

public class LineAndDistance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for the coordinates of two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Compute the Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Compute the equation of the line passing through the two points
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("The equation of the line is: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }

    // Method to compute the Euclidean distance between two points
    private static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Using Math.pow and Math.sqrt for calculating distance
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    // Method to find the equation of the line given two points
    private static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate slope (m)
        double slope = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (b)
        double intercept = y1 - slope * x1;

        // Return the slope and intercept in an array
        return new double[]{slope, intercept};
    }
}



// Hint => 
// Take inputs for 2 points x1, y1, and x2, y2 
// Method to find the Euclidean distance between two points and return the distance
// distance = (x2-x1)2 +(y2-y1)2 
// Write a Method to find the equation of a line given two points and return the equation which includes the slope and the y-intercept
// The equation of a line is given by the equation y = m*x + b Where m is the slope and b is the y-intercept. So firstly compute the slope using the formulae 
// m = (y2 - y1)/(x2 - x1)
// Post that compute the y-intercept b using the formulae 
// b = y1 - m*x1  
// Finally, return an array having slope m and y-intercept b 
