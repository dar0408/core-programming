// An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
// Hint => 
// Take input for a number of persons
// Create arrays to store the weight, height, BMI, and weight status of the persons
// Take input for the weight and height of the persons
// Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
// Display the height, weight, BMI, and weight status of each person
// Use the table to determine the weight status of the person

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of persons
        System.out.println("Enter the number of persons");
        int persons = sc.nextInt();

        // Create arrays to store weight, height, BMI, and status for each person
        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];

        // Loop to input weight and height for each person and calculate BMI
        for (int i = 0; i < persons; i++) {
            System.out.println("Enter the weight of person " + (i + 1));
            weight[i] = sc.nextDouble();  // Store the weight of the person
            System.out.println("Enter the height of person " + (i + 1));
            height[i] = sc.nextDouble();  // Store the height of the person
            
            // Calculate BMI using the formula: BMI = weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine the BMI status based on the calculated BMI value
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";  // If BMI is less than 18.5, the person is underweight
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";  // If BMI is between 18.5 and 24.9, the person has normal weight
            } else if (bmi[i] >= 24.9 && bmi[i] < 29.9) {
                status[i] = "Overweight";  // If BMI is between 24.9 and 29.9, the person is overweight
            } else {
                status[i] = "Obese";  // If BMI is 30 or more, the person is obese
            }
        }

        // Print the header for the BMI table
        System.out.println("Person\tWeight\tHeight\tBMI\tStatus");

        // Loop to print the BMI results for each person
        for (int i = 0; i < persons; i++) {
            System.out.println((i + 1) + "\t" + weight[i] + "\t" + height[i] + "\t" + bmi[i] + "\t" + status[i]);
            // Print the person's index, weight, height, BMI, and BMI status
        }
    }
}
