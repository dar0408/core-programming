// Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
// Hint => 
// Create a String Array to save the results and 
// Finally, loop again to show the results of the array based on the index position

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt(); // Read the number from the user
        
        // Check if the input is a valid natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
            System.exit(0);
        }
        
        String[] fizzBuzz = new String[number]; // Array to store FizzBuzz results
        
        // Loop to determine FizzBuzz values for numbers from 1 to 'number'
        for (int i = 0; i < number; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) { // Check if divisible by both 3 and 5
                fizzBuzz[i] = "FizzBuzz";
            } else if ((i + 1) % 3 == 0) { // Check if divisible by 3
                fizzBuzz[i] = "Fizz";
            } else if ((i + 1) % 5 == 0) { // Check if divisible by 5
                fizzBuzz[i] = "Buzz";
            } else { // Otherwise, store the number as a string
                fizzBuzz[i] = String.valueOf(i + 1);
            }
        }
        
        // Print the FizzBuzz output
        for (int i = 0; i < fizzBuzz.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + fizzBuzz[i]);
        }
    }
}
