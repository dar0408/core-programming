// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result



import java.util.Scanner;
public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num > 0){
            int sum = 0;
            int i = 1;
            while(i <= num){
                sum += i;
                i++;
            }
            System.out.println("The sum of " + num + " natural numbers is " + sum);
            System.out.println("The sum of " + num + " natural numbers using formulae is " + num * (num + 1) / 2);
        }else{
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}
