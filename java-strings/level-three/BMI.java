// An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Create a 2D array to store weight and height for 10 people
        double[][] arr = new double[10][2];
        
        // Loop to gather weight and height data for 10 people
        for (int i = 0; i < 10; i++) {
            // Ask for the weight of the person in kilograms
            System.out.println("Enter the weight of person " + (i + 1) + " in kg");
            arr[i][0] = sc.nextDouble();
            
            // Ask for the height of the person in centimeters
            System.out.println("Enter the height of person " + (i + 1) + " in cm");
            arr[i][1] = sc.nextDouble();
        }
        
        // Call the findBMI method to calculate BMI and categorize the results
        String[][] result = findBMI(arr);
        
        // Call the display method to show the results in a table format
        display(result);
    }

    // Method to calculate BMI and determine the status for each person
    public static String[][] findBMI(double[][] arr) {
        // Create a 2D array to store weight, height, BMI, and status for each person
        String[][] result = new String[10][4];
        
        // Loop through each person to calculate their BMI and determine their weight status
        for (int i = 0; i < 10; i++) {
            // Get the weight and height from the array
            double weight = arr[i][0];
            double height = arr[i][1] / 100; // Convert height from cm to meters
            
            // Calculate BMI using the formula: BMI = weight / (height * height)
            double bmi = weight / (height * height);
            String status = ""; // Variable to store the status based on BMI
            
            // Determine the weight status based on BMI
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }
            
            // Store the weight, height, BMI, and status for each person in the result array
            result[i][0] = String.valueOf(arr[i][0]);
            result[i][1] = String.valueOf(arr[i][1]);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        
        // Return the result array containing all the BMI information
        return result;
    }

    // Method to display the BMI results in a tabular format
    public static void display(String[][] result) {
        // Print the header for the table
        System.out.println("Person's Height\tPerson's Weight\tBMI\tStatus");
        
        // Loop through the result array and print the BMI information for each person
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                // Print each column of the table with proper spacing
                System.out.print(result[i][j] + "\t\t\t");
            }
            // Move to the next line after printing each person's information
            System.out.println();
        }
    }
}





// Hint => 
// Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
// Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
// Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
