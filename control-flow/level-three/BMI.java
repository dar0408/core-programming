// Create a program to find the BMI of a person
// Hint => 
// Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
// Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Use the table to determine the weight status of the person


import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in kg: ");
        double weight = sc.nextDouble();
        System.out.println("Enter the height in cm: ");
        double height = sc.nextDouble();
        sc.close();
        double bmi = weight / ((height / 100) * (height / 100));
        System.out.println("The BMI of the person is: " + bmi);
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