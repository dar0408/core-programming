// Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using for loop
// Compare the two results and print the result


import java.util.Scanner;
public class NaturalSumUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num > 0){
            int sum = 0;
            for(int i = 1; i <= num; i++){
                sum += i;
            }
            System.out.println("The sum of " + num + " natural numbers is " + sum);
            System.out.println("The sum of " + num + " natural numbers using formulae is " + num * (num + 1) / 2);
        }else{
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}
