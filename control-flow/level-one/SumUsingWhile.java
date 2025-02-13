// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;


import java.util.Scanner;
public class SumUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;
        while(true){
            System.out.println("Enter the number: ");
            num = sc.nextDouble();
            if(num <= 0){
                break;
            }
            total += num;
        }
        System.out.println("The sum of numbers is " + total);
    }
}