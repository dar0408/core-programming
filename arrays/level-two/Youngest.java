// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
// Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
// Finally display the youngest and tallest of the 3 friends


import java.util.Scanner;
public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < friends.length; i++) {
            System.out.println("Enter the age of " + friends[i]);
            ages[i] = sc.nextInt();
            System.out.println("Enter the height of " + friends[i]);
            heights[i] = sc.nextDouble();
        }
        int youngest = ages[0];
        double tallest = heights[0];
        for (int i = 1; i < friends.length; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        System.out.println("The youngest friend is " + friends[youngest] + " with age " + youngest);
        System.out.println("The tallest friend is " + friends[tallest] + " with height " + tallest);
    }
}