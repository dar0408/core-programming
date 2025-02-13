// Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

// Hint => 
// Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks


import java.util.Scanner; // Import Scanner class for user input

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Prompt user to enter marks for each subject
        System.out.println("Enter the marks of Physics: ");
        float physics = sc.nextFloat(); // Read Physics marks

        System.out.println("Enter the marks of Chemistry: ");
        float chemistry = sc.nextFloat(); // Read Chemistry marks

        System.out.println("Enter the marks of Maths: ");
        float maths = sc.nextFloat(); // Read Maths marks

        sc.close(); // Close the scanner to prevent resource leaks

        // Calculate percentage by taking the average of the three subjects
        float percentage = (physics + chemistry + maths) / 3;
        System.out.println("The percentage is: " + percentage);

        // Determine the grade based on the percentage obtained
        if (percentage >= 40) { // Minimum passing percentage
            if (percentage >= 70) {
                System.out.println("The grade is A"); // Grade A for 70% and above
            } else if (percentage >= 60) {
                System.out.println("The grade is B"); // Grade B for 60-69%
            } else if (percentage >= 50) {
                System.out.println("The grade is C"); // Grade C for 50-59%
            } else {
                System.out.println("The grade is D"); // Grade D for 40-49%
            }
        } else {
            System.out.println("The grade is F"); // Grade F for below 40% (Fail)
        }
    }
}
