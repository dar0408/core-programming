// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result


import java.util.Scanner;
public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // Checking if the number is a natural number (greater than 0)
        if(num > 0){
            int sum = 0; // Initializing sum variable
            int i = 1; // Counter variable for the loop

            // Using a while loop to calculate the sum of the first N natural numbers
            while(i <= num){
                sum += i; // Adding the current value of i to sum
                i++; // Incrementing i
            }

            // Displaying the sum calculated using the loop
            System.out.println("The sum of " + num + " natural numbers is " + sum);

            // Using the mathematical formula for sum of first N natural numbers: n(n+1)/2
            System.out.println("The sum of " + num + " natural numbers using formulae is " + num * (num + 1) / 2);
        } else {
            // If the number is not a natural number, display a message
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}
