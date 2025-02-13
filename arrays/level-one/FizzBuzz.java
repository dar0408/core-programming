// Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
// Hint => 
// Create a String Array to save the results and 
// Finally, loop again to show the results of the array based on the index position



import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a natural number");
            System.exit(0);
        }
        String[] fizzBuzz = new String[number];
        for (int i = 0; i < number; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                fizzBuzz[i] = "FizzBuzz";
            } else if ((i + 1) % 3 == 0) {
                fizzBuzz[i] = "Fizz";
            } else if ((i + 1) % 5 == 0) {
                fizzBuzz[i] = "Buzz";
            } else {
                fizzBuzz[i] = String.valueOf(i + 1);
            }
        }
        for (int i = 0; i < fizzBuzz.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + fizzBuzz[i]);
        }
    }
}