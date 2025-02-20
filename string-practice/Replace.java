// 12. Write a replace method in Java that replaces a given word with another word in a
// sentence:
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input sentence from the user
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Taking the word to be replaced from the user
        System.out.println("Enter the word to replace: ");
        String wordToReplace = sc.nextLine();

        // Taking the new word to replace the old word with
        System.out.println("Enter the new word: ");
        String newWord = sc.nextLine();

        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");
        
        // Initialize an empty result string to store the modified sentence
        String result = "";

        // Loop through each word in the sentence
        for(String word : words) {
            // If the word matches the word to replace, add the new word to the result
            if(word.equals(wordToReplace)) {
                result += newWord + " "; // Add the new word followed by a space
            } else {
                result += word + " "; // Add the current word followed by a space
            }
        }

        // Print the modified sentence with extra spaces trimmed
        System.out.println("Modified sentence: " + result.trim());
    }
}
