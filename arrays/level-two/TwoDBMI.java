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
        System.out.println("Enter the number of persons");
        int persons = sc.nextInt();
        double[][] personData = new double[persons][3];
        String[] weightStatus = new String[persons];
        for (int i = 0; i < persons; i++) {
            System.out.println("Enter the weight of person " + (i + 1));
            personData[i][0] = sc.nextDouble();
            while (personData[i][0] < 0) {
                System.out.println("Enter a positive value for weight");
                personData[i][0] = sc.nextDouble();
            }
            System.out.println("Enter the height of person " + (i + 1));
            personData[i][1] = sc.nextDouble();
            while (personData[i][1] < 0) {
                System.out.println("Enter a positive value for height");
                personData[i][1] = sc.nextDouble();
            }
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
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
        System.out.println("Person\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < persons; i++) {
            System.out.println((i + 1) + "\t" + personData[i][0] + "\t" + personData[i][1] + "\t" + personData[i][2] + "\t" + weightStatus[i]);
        }
    }
}