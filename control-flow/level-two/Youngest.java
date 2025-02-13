// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for the age and height of the 3 friends and store it in a variable
// Find the smallest of the 3 ages to find the youngest friend and display it
// Find the largest of the 3 heights to find the tallest friend and display it

import java.util.Scanner; // Import Scanner class for user input

public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Take input for the ages of three friends
        System.out.println("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.println("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();

        // Take input for the heights of three friends
        System.out.println("Enter the height of Amar: ");
        int heightAmar = sc.nextInt();
        System.out.println("Enter the height of Akbar: ");
        int heightAkbar = sc.nextInt();
        System.out.println("Enter the height of Anthony: ");
        int heightAnthony = sc.nextInt();

        // Initialize the youngest age with Amar's age
        int youngest = ageAmar;

        // Compare Akbar's age to find the youngest
        if (ageAkbar < youngest) {
            youngest = ageAkbar;
        }

        // Compare Anthony's age to find the youngest
        if (ageAnthony < youngest) {
            youngest = ageAnthony;
        }

        // Print the youngest friend's age
        System.out.println("The youngest friend is " + youngest + " years old");

        // Initialize the tallest height with Amar's height
        int tallest = heightAmar;

        // Compare Akbar's height to find the tallest
        if (heightAkbar > tallest) {
            tallest = heightAkbar;
        }

        // Compare Anthony's height to find the tallest
        if (heightAnthony > tallest) {
            tallest = heightAnthony;
        }

        // Print the tallest friend's height
        System.out.println("The tallest friend is " + tallest + " cm tall");
    }
}
