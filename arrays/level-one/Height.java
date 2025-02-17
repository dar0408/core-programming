// Create a program to find the mean height of players present in a football team.
// Hint => 
// The formula to calculate the mean is: mean = sum of all elements / number of elements
// Create a double array named heights of size 11 and get input values from the user.
// Find the sum of all the elements present in the array.
// Divide the sum by 11 to find the mean height and print the mean height of the football team

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11]; // Array to store the heights of 11 players
        double sum = 0.0; // Variable to calculate the total sum of heights
        
        // Loop to take input for each player's height
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Enter the height of player " + (i + 1));
            heights[i] = sc.nextDouble(); // Read height input from the user
            sum += heights[i]; // Add the height to the sum
        }
        
        double mean = sum / 11; // Calculate the mean height
        System.out.println("The mean height of the football team is " + mean); // Display the mean height
    }
}
