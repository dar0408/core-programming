// Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
// Hint => 
// Take input for a number of persons
// Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
//        double[][] personData = new double[number][3];
//        String[] weightStatus = new String[number];
// Take input for weight and height of the persons and for negative values, ask the user to enter positive values
// Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
// Display the height, weight, BMI and status of each person

import java.util.Scanner;

public class TwoDBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask for the number of persons
        System.out.println("Enter the number of persons");
        int persons = sc.nextInt();
        
        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[persons][3];
        // Array to store the weight status for each person
        String[] weightStatus = new String[persons];

        // Loop through each person to gather their data
        for (int i = 0; i < persons; i++) {
            // Input weight for the person and ensure it's positive
            System.out.println("Enter the weight of person " + (i + 1));
            personData[i][0] = sc.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.println("Enter a positive value for weight");
                personData[i][0] = sc.nextDouble();
            }

            // Input height for the person and ensure it's positive
            System.out.println("Enter the height of person " + (i + 1));
            personData[i][1] = sc.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.println("Enter a positive value for height");
                personData[i][1] = sc.nextDouble();
            }

            // Calculate the BMI using the formula: BMI = weight / (height * height)
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine the weight status based on the BMI value
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 24.9 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Print the results with headers
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");
        
        // Print the data for each person, including weight, height, BMI, and weight status
        for (int i = 0; i < persons; i++) {
            System.out.println((i + 1) + "\t" + personData[i][0] + "\t" + personData[i][1] + "\t" + personData[i][2] + "\t" + weightStatus[i]);
        }
    }
}
