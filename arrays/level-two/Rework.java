// Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
// Hint => 
// In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
// To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
// Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number

import java.util.Scanner;
import java.util.ArrayList;

public class Rework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        
        // Create an ArrayList to store digits
        ArrayList<Integer> digits = new ArrayList<>();
        
        // Extract digits and store in the ArrayList
        while (number != 0) {
            digits.add(number % 10);
            number /= 10;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Find the largest and second largest digits
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }
        }
        
        // Output the result
        System.out.println("The largest digit is " + largest);
        System.out.println("The second largest digit is " + secondLargest);
    }
}
