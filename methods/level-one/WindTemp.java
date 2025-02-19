// Write a program calculate the wind chill temperature given the temperature and wind speed
import java.util.Scanner;

public class WindTemp {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature
        System.out.println("Enter the temperature: ");
        // Read the temperature from user input
        double temperature = sc.nextDouble();

        // Prompt the user to enter the wind speed
        System.out.println("Enter the wind speed: ");
        // Read the wind speed from user input
        double windSpeed = sc.nextDouble();

        // Call the calculateWindChill method to calculate the wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Output the calculated wind chill temperature
        System.out.println("The wind chill temperature is " + windChill);
    }

    // Method to calculate the wind chill temperature using the formula
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula: 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * windSpeed^0.16
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}

// Hint => 
// Write a method to calculate the wind chill temperature using the formula 
// windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
// public double calculateWindChill(double temperature, double windSpeed)

