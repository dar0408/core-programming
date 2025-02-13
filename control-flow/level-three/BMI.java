// Create a program to find the BMI of a person
// Hint => 
// Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
// Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Use the table to determine the weight status of the person

import java.util.Scanner; // Import Scanner class for user input

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter weight
        System.out.println("Enter the weight in kg: ");
        double weight = sc.nextDouble(); // Read weight input

        // Prompt the user to enter height
        System.out.println("Enter the height in cm: ");
        double height = sc.nextDouble(); // Read height input
        sc.close(); // Close the scanner to prevent resource leaks

        // Calculate BMI using the formula: weight (kg) / (height (m) * height (m))
        double bmi = weight / ((height / 100) * (height / 100));

        // Print the calculated BMI
        System.out.println("The BMI of the person is: " + bmi);

        // Determine the BMI category based on standard ranges
        if (bmi < 18.5) {
            System.out.println("The person is Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("The person is Normal Weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("The person is Overweight");
        } else {
            System.out.println("The person is Obese");
        }
    }
}
