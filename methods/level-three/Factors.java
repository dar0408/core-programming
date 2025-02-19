// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods




import java.util.ArrayList;

public class Factors {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int num) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsList.add(i);
            }
        }
        // Convert ArrayList to int array
        return factorsList.stream().mapToInt(Integer::intValue).toArray();
    }

    // Method to find the greatest factor of a number
    public static int greatestFactor(int num) {
        int[] factors = findFactors(num);
        return factors[factors.length - 2]; // Second last element (excluding the number itself)
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int num) {
        int[] factors = findFactors(num);
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find product of cubes of factors
    public static long productOfCubeOfFactors(int num) {
        int[] factors = findFactors(num);
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        int num = 28; // Example number

        System.out.println("Number: " + num);
        System.out.println("Factors: " + java.util.Arrays.toString(findFactors(num)));
        System.out.println("Greatest Factor: " + greatestFactor(num));
        System.out.println("Sum of Factors: " + sumOfFactors(num));
        System.out.println("Product of Factors: " + productOfFactors(num));
        System.out.println("Product of Cubes of Factors: " + productOfCubeOfFactors(num));
        System.out.println("Is Perfect Number? " + isPerfectNumber(num));
        System.out.println("Is Abundant Number? " + isAbundantNumber(num));
        System.out.println("Is Deficient Number? " + isDeficientNumber(num));
        System.out.println("Is Strong Number? " + isStrongNumber(num));
    }
}



// Hint => 
// Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
// Method to find the greates factor of a Number using the factors array
// Method to find the sum of the factors using factors array and return the sum
// Method to find the product of the factors using factors array and return the product
// Method to find product of cube of the factors using the factors array. Use Math.pow() 
// Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
// Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
// Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
// Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
