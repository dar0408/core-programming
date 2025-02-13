// Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
// Hint => 
// Define an integer array of 5 elements and get user input to store in the array.
// Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
// If the number is negative, print negative. Else if the number is zero, print zero. 
// Finally compare the first and last element of the array and display if they equal, greater or less


import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter the number " + (i + 1));
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                if (num[i] % 2 == 0) {
                    System.out.println("The number " + num[i] + " is positive and even");
                } else {
                    System.out.println("The number " + num[i] + " is positive and odd");
                }
            } else if (num[i] < 0) {
                System.out.println("The number " + num[i] + " is negative");
            } else {
                System.out.println("The number " + num[i] + " is zero");
            }
        }
        if (num[0] == num[num.length - 1]) {
            System.out.println("The first and last elements are equal");
        } else if (num[0] > num[num.length - 1]) {
            System.out.println("The first element is greater than the last element");
        } else {
            System.out.println("The first element is less than the last element");
        }
    }
}