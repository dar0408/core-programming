// 11. Write a Java program that accepts two strings from the user and checks if the two
// strings are anagrams of each other (i.e., whether they contain the same characters in any
// order).


import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the first string
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        // Taking input for the second string
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        // If lengths of both strings are not equal, they cannot be anagrams
        if(str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams");
            return;
        }

        // Array to keep track of character counts
        int[] count = new int[256]; // Considering extended ASCII characters

        // Incrementing count for characters in str1 and decrementing for str2
        for(int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++; // Increment for str1 characters
            count[str2.charAt(i)]--; // Decrement for str2 characters
        }

        // Checking if all elements in count array are zero
        for(int i = 0; i < 256; i++) {
            if(count[i] != 0) { // If any value is non-zero, strings are not anagrams
                System.out.println("The strings are not anagrams");
                return;
            }
        }

        // If all character counts match, strings are anagrams
        System.out.println("The strings are anagrams");
    }
}
