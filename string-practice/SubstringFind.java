// 6. Find Substring Occurrences
// Problem:
// Write a Java program to count how many times a given substring occurs in a string.


import java.util.Scanner;

public class SubstringFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Taking input substring from the user
        System.out.println("Enter a substring: ");
        String subStr = sc.nextLine();

        // Initialize count to track the number of occurrences of the substring
        int count = 0;

        // Loop through each character in the string
        for(int i = 0; i < str.length(); i++) {
            // Check if the substring starting from index i matches the input substring
            if(str.substring(i).startsWith(subStr)) {
                count++; // Increment the count if a match is found
            }
        }

        // Print the number of occurrences of the substring
        System.out.println("Number of occurrences: " + count);
    }
}
