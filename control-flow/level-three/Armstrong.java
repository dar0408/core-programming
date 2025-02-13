// Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
// Hint => 
// Armstrong Number is a number whose Sum of cubes of each digit results in the original number as in for e.g. 153 = 1^3 + 5^3 + 3^3
// Get an integer input and store it in the number variable and define sum variable, initialize it to zero and originalNumber variable and assign it to input number variable
// Use the while loop till the originalNumber is not equal to zero
// In the while loop find the reminder number by using the modulus operator as in  number % 10. Find the cube of the number and add it to the sum variable
// Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression. This romoves the last digit of the original number.
// Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly


import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        int sum = 0;
        int originalNumber = number;
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            sum += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (number == sum) {
            System.out.println("The number is an Armstrong Number");
        } else {
            System.out.println("The number is not an Armstrong Number");
        }
    }
}