// Rewrite program 8 to do the countdown using the for-loop

import java.util.Scanner;
public class CountdownForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the starting number of the countdown
        System.out.println("Enter the number: ");
        int counter = sc.nextInt();

        // Using a for loop to print the countdown from the given number to 1
        for(int i = counter; i > 0; i--){
            System.out.println(i); // Printing the current value of i
        }
    }
}
