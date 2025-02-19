// Write a program to split the text into words and find the shortest and longest strings in a given text

import java.util.Scanner;

public class ShortAndLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String[] words = splitWords(str);
        String[][] wordsLength = splitWordsLength(words);
        int[] shortLong = findShortLong(wordsLength);
        System.out.println("Shortest word: " + words[shortLong[0]]);
        System.out.println("Longest word: " + words[shortLong[1]]);
    }

    public static String[] splitWords(String str) {
        return str.split(" ");
    }

    public static String[][] splitWordsLength(String[] words) {
        String[][] wordsLength = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsLength[i][0] = words[i];
            wordsLength[i][1] = String.valueOf(words[i].length());
        }
        return wordsLength;
    }

    public static int[] findShortLong(String[][] wordsLength) {
        int[] shortLong = new int[2];
        shortLong[0] = 0;
        shortLong[1] = 0;
        for (int i = 1; i < wordsLength.length; i++) {
            int currentLength = Integer.parseInt(wordsLength[i][1]);
            int shortLength = Integer.parseInt(wordsLength[shortLong[0]][1]);
            int longLength = Integer.parseInt(wordsLength[shortLong[1]][1]);
            
            if (currentLength < shortLength) {
                shortLong[0] = i;
            }
            if (currentLength > longLength) {
                shortLong[1] = i;
            }
        }
        return shortLong;
    }
}



// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
// Create a method to find and return a string's length without using the length() method. 
// Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
// Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
// The main function calls the user-defined methods and displays the result. 
