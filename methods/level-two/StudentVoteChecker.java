// Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Declare an array to hold the ages of 10 students
        int[] ages = new int[10];
        
        // Loop to get the ages of the 10 students from the user
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();  // Store the entered age in the array
        }
        
        // Loop through the array and check if each student can vote
        for (int i = 0; i < ages.length; i++) {
            if (canStudentVote(ages[i])) {  // Check if the student can vote
                System.out.println("Student " + (i + 1) + " can vote");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote");
            }
        }
    }

    // Method to check if a student can vote based on their age
    public static boolean canStudentVote(int age) {
        if (age < 0) {  // Negative age is not valid
            return false;
        }
        if (age >= 18) {  // If age is 18 or greater, the student can vote
            return true;
        }
        return false;  // If age is less than 18, the student cannot vote
    }
}

// Hint => 
// Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false
// Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. For valid age check for age is 18 or above return true; else return false;
// In the main function define an array of 10 integer elements, loop through the array by take user input for the student's age, call canStudentVote() and display the result
