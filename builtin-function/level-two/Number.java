// 1. Number Guessing Game:

import java.util.Scanner;  // Importing Scanner class for user input
import java.util.Random;  // Importing Random class to generate random numbers

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input
        Random rand = new Random();  // Creating Random object to generate random numbers
        
        int min = 1, max = 100;  // Defining the range of numbers
        int guess = rand.nextInt(max) + min;  // Generating the first random guess
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Press enter when you are ready.");
        sc.nextLine();  // Waiting for user to press enter
        
        int feedback = 0;  // Variable to store user feedback (1, 2, or 3)
        
        // Looping until the correct number is guessed
        while (feedback != 3) {
            System.out.println("Is the number " + guess + "?");
            System.out.println("1. Too high");
            System.out.println("2. Too low");
            System.out.println("3. Correct");
            feedback = sc.nextInt();  // Reading user feedback
            
            // Adjusting the range and generating a new guess based on feedback
            switch (feedback) {
                case 1:
                    max = guess - 1;  // Decrease the upper bound if guess is too high
                    break;
                case 2:
                    min = guess + 1;  // Increase the lower bound if guess is too low
                    break;
                case 3:
                    System.out.println("Yay! I guessed the number.");  // Correct guess
                    break;
                default:
                    System.out.println("Invalid choice!");  // Handling invalid input
            }
            guess = rand.nextInt(max - min + 1) + min;  // Generating a new guess within the updated range
        }
    }
}



// ○ Write a Java program where the user thinks of a number between 1 and 100, and
// the computer tries to guess the number by generating random guesses.
// ○ The user provides feedback by indicating whether the guess is high, low, or
// correct. The program should be modular, with different functions for generating
// guesses, receiving user feedback, and determining the next guess.