// Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
// Hint => 
// Define an array of 10 integer elements and take user input for the student's age. 
// Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. 
//add comments also
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Create an array to store the age of 10 students
        int[] age = new int[10];

        // Loop to input the age of each student
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the age of student " + (i + 1));
            age[i] = sc.nextInt();  // Store the entered age in the array
        }

        // Loop to check if each student can vote based on their age
        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                // If the entered age is negative, display an invalid age message
                System.out.println("Invalid age");
            } else if (age[i] >= 18) {
                // If the student's age is 18 or more, they are eligible to vote
                System.out.println("The student with the age " + age[i] + " can vote");
            } else {
                // If the student's age is less than 18, they cannot vote
                System.out.println("The student with the age " + age[i] + " cannot vote");
            }
        }
    }
}
