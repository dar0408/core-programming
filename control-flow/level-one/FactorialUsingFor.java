// Rewrite program 14 using for loop
// Hint => 
// Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 


import java.util.Scanner;
public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num > 0){
            int fact = 1;
            for(int i = 1; i <= num; i++){
                fact *= i;
            }
            System.out.println("The factorial of " + num + " is " + fact);
        }else{
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}
