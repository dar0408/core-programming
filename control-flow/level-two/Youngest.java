// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for the age and height of the 3 friends and store it in a variable
// Find the smallest of the 3 ages to find the youngest friend and display it
// Find the largest of the 3 heights to find the tallest friend and display it


import java.util.Scanner;
public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.println("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.println("Enter the height of Amar: ");
        int heightAmar = sc.nextInt();
        System.out.println("Enter the height of Akbar: ");
        int heightAkbar = sc.nextInt();
        System.out.println("Enter the height of Anthony: ");
        int heightAnthony = sc.nextInt();
        int youngest = ageAmar;
        if (ageAkbar < youngest) {
            youngest = ageAkbar;
        }
        if (ageAnthony < youngest) {
            youngest = ageAnthony;
        }
        System.out.println("The youngest friend is " + youngest + " years old");
        int tallest = heightAmar;
        if (heightAkbar > tallest) {
            tallest = heightAkbar;
        }
        if (heightAnthony > tallest) {
            tallest = heightAnthony;
        }
        System.out.println("The tallest friend is " + tallest + " cm tall");
    }
}