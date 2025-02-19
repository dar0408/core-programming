// Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().


import java.util.Arrays;

public class RandomNumber {
    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] numbers = generate4DigitRandomArray(5);
        
        // Print the generated random numbers
        System.out.println("Random numbers: " + Arrays.toString(numbers));
        
        // Calculate the average, minimum, and maximum values of the numbers
        double[] result = findAverageMinMax(numbers);
        
        // Print the average, minimum, and maximum values
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }

    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number between 1000 and 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;  // Return the generated array
    }

    // Method to calculate the average, minimum, and maximum of an array of integers
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        // Loop through the array to calculate sum, minimum, and maximum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);  // Update min if a smaller number is found
            max = Math.max(max, numbers[i]);  // Update max if a larger number is found
        }
        
        // Calculate the average by dividing sum by the number of elements
        double average = sum / numbers.length;
        
        // Return the results: average, minimum, and maximum
        return new double[] {average, min, max};
    }
}

// Hint => 
// Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
// public int[] generate4DigitRandomArray(int size)
// Write a method to find average, min and max value of an array 
// public double[] findAverageMinMax(int[] numbers) 

