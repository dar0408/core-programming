// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
// Hint => 
// Take the input for a number
// Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, factors array of size maxFactor and index variable to reflect the index of the array. 
// To find factors loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index. If the index is equal to maxIndex, then need factors array to store more elements
// To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and eventually assign the factors array to the temp array
// Finally, Display the factors of the number

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factors");
        int number = sc.nextInt(); // Read the number from the user
        int maxFactor = 10; // Initial size of the array to store factors
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; // Index to track the number of factors found
        
        // Loop to find factors of the given number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if 'i' is a factor of 'number'
                factors[index] = i; // Store factor in the array
                index++;
                
                // If the array is full, double its size
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor]; // Create a larger array
                    
                    // Copy old factors to the new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // Update reference to the new array
                }
            }
        }
        
        // Print all found factors
        System.out.println("The factors of " + number + " are");
        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }
    }
}
