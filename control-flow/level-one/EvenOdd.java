// Create a program to print odd and even numbers between 1 to the number entered by the user.
// Hint => 
// Get an integer input from the user, assign to a variable number and check for Natural Number
// Using a for loop, iterate from 1 to the number
// In each iteration of the loop, print the number is odd or even number


import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num > 0){
            for(int i = 1; i <= num; i++){
                if(i % 2 == 0){
                    System.out.println(i + " is an even number.");
                }else{
                    System.out.println(i + " is an odd number.");
                }
            }
        }else{
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}