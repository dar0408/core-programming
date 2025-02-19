// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results


import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        ArrayList<Integer> factors = findFactors(num);
        System.out.println("Factors of " + num + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of square of factors: " + sumOfSquareOfFactors(factors));
    }

    static ArrayList<Integer> findFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                factors.add(i);
                if (i != num / i) {  // Avoid adding square roots twice
                    factors.add(num / i);
                }
            }
        }
        return factors;
    }

    static int sumOfFactors(ArrayList<Integer> factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    static int productOfFactors(ArrayList<Integer> factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    static int sumOfSquareOfFactors(ArrayList<Integer> factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
}


// Hint => 
// Take the input for a number
// Write a static Method to find the factors of the number and save them in an array and return the array. 
// To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
// Write a method to find the sum of the factors using factors array
// Write a method to find the product of the factors using factors array
// Write a method to find the sum of square of the factors using Math.pow() method
