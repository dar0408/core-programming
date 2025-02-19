// Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it


import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Array of friends' names
        String[] friends = {"Amar", "Akbar", "Anthony"};
        
        // Arrays to store ages and heights of friends
        int[] ages = new int[3];
        int[] heights = new int[3];
        
        // Loop to input age and height for each friend
        for (int i = 0; i < friends.length; i++) {
            // Prompt user to enter age for each friend and store in the ages array
            System.out.println("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            
            // Prompt user to enter height for each friend and store in the heights array
            System.out.println("Enter height of " + friends[i] + ": ");
            heights[i] = sc.nextInt();
        }
        
        // Call findYoungest method to find the youngest friend and display the result
        System.out.println("Youngest friend is: " + findYoungest(friends, ages));
        
        // Call findTallest method to find the tallest friend and display the result
        System.out.println("Tallest friend is: " + findTallest(friends, heights));
    }

    // Method to find the youngest friend
    static String findYoungest(String[] friends, int[] ages) {
        int minAge = ages[0];  // Start with the first friend's age as the minimum age
        String youngest = friends[0];  // Start with the first friend's name as the youngest
        
        // Loop through the ages array to find the minimum age and corresponding friend
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];  // Update the minimum age
                youngest = friends[i];  // Update the youngest friend's name
            }
        }
        return youngest;  // Return the name of the youngest friend
    }

    // Method to find the tallest friend
    static String findTallest(String[] friends, int[] heights) {
        int maxHeight = heights[0];  // Start with the first friend's height as the maximum height
        String tallest = friends[0];  // Start with the first friend's name as the tallest
        
        // Loop through the heights array to find the maximum height and corresponding friend
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];  // Update the maximum height
                tallest = friends[i];  // Update the tallest friend's name
            }
        }
        return tallest;  // Return the name of the tallest friend
    }
}



// Hint => 
// Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
// Write a Method to find the youngest of the 3 friends
// Write a Method to find the tallest of the 3 friends