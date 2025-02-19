// Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 

import java.util.Scanner;

public class YardToFeet {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Ask user for the value in yards and read the input
        System.out.println("Enter yards: ");
        double yards = sc.nextDouble();
        
        // Convert yards to feet and display the result
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet");
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        // Conversion factor from yards to feet (1 yard = 3 feet)
        double yards2feet = 3;
        return yards * yards2feet;  // Return the converted value
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        // Conversion factor from feet to yards (1 foot = 0.333333 yards)
        double feet2yards = 0.333333;
        return feet * feet2yards;  // Return the converted value
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        // Conversion factor from meters to inches (1 meter = 39.3701 inches)
        double meters2inches = 39.3701;
        return meters * meters2inches;  // Return the converted value
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        // Conversion factor from inches to meters (1 inch = 0.0254 meters)
        double inches2meters = 0.0254;
        return inches * inches2meters;  // Return the converted value
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        // Conversion factor from inches to centimeters (1 inch = 2.54 cm)
        double inches2cm = 2.54;
        return inches * inches2cm;  // Return the converted value
    }
}

// public static double convertYardsToFeet(double yards) => 
// Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
// Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
// Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
// Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
// Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
