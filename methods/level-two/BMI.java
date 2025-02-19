// An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Create a 2D array to store the weight, height, and BMI of 10 people
        double[][] persons = new double[10][3];

        // Loop to get the weight and height of 10 people from user input
        for (int i = 0; i < persons.length; i++) {
            // Prompt user to enter weight for each person
            System.out.println("Enter weight of person " + (i + 1) + " in kg: ");
            // Store the weight in the first column of the array
            persons[i][0] = sc.nextDouble();

            // Prompt user to enter height for each person
            System.out.println("Enter height of person " + (i + 1) + " in cm: ");
            // Store the height in the second column of the array
            persons[i][1] = sc.nextDouble();
        }

        // Calculate BMI for each person using the findBMI method
        findBMI(persons);

        // Find the BMI status for each person using the findBMIStatus method
        String[] status = findBMIStatus(persons);

        // Loop to display the BMI and status of each person
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Person " + (i + 1) + " weight: " + persons[i][0] + " kg, height: " + persons[i][1] + " cm, BMI: " + persons[i][2] + ", Status: " + status[i]);
        }
    }

    // Method to calculate BMI for each person
    static void findBMI(double[][] persons) {
        for (int i = 0; i < persons.length; i++) {
            // Retrieve weight and height for each person
            double weight = persons[i][0];
            double height = persons[i][1] / 100;  // Convert height from cm to meters
            // Calculate BMI using the formula: weight / height^2
            double bmi = weight / (height * height);
            // Store the calculated BMI in the third column of the array
            persons[i][2] = bmi;
        }
    }

    // Method to determine the BMI status for each person based on their BMI
    static String[] findBMIStatus(double[][] persons) {
        // Create an array to store the status for each person
        String[] status = new String[persons.length];

        // Loop through each person to assign the appropriate BMI status
        for (int i = 0; i < persons.length; i++) {
            double bmi = persons[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 24.9 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        // Return the array containing the status for each person
        return status;
    }
}

// Hint => 
// Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
// Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status

