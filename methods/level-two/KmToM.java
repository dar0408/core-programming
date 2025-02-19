// Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
// public static double convertKmToMiles(double km) => 
// Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
// Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
// Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
// Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;

import java.util.Scanner;

public class KmToM {
    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter kilometers
        System.out.println("Enter kilometers: ");
        double km = sc.nextDouble();
        
        // Convert kilometers to miles and display the result
        System.out.println(km + " km is " + convertKmToMiles(km) + " miles");
    }

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;  // Conversion factor
        return km * km2miles;  // Return the result of the conversion
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;  // Conversion factor
        return miles * miles2km;  // Return the result of the conversion
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;  // Conversion factor
        return meters * meters2feet;  // Return the result of the conversion
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;  // Conversion factor
        return feet * feet2meters;  // Return the result of the conversion
    }
}
