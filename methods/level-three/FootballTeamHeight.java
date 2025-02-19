// Create a program to find the shortest, tallest, and mean height of players present in a football team.


import java.util.Random;

public class FootballTeamHeight {
    
    // Method to generate random heights between 150 and 250 cm
    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // Random number between 150 and 250
        }
        return heights;
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }

    // Method to find the shortest player
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest player
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11); // Create an array of 11 players' heights

        // Display the generated heights
        System.out.print("Players' Heights: ");
        for (int height : heights) {
            System.out.print(height + " cm ");
        }
        System.out.println();

        // Calculate required values
        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Player Height: " + shortest + " cm");
        System.out.println("Tallest Player Height: " + tallest + " cm");
    }
}


// Hint => 
// The formula to calculate the mean is: mean = sum of all elements/number of elements
// Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
// Write the method to Find the sum of all the elements present in the array.
// Write the method to find the mean height of the players on the football team
// Write the method to find the shortest height of the players on the football team 
// Write the method to find the tallest height of the players on the football team
// Finally display the results