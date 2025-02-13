// Write a program the find the distance in yards and miles for the distance provided by user in feets
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet
// I/P => distanceInFeet
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


import java.util.Scanner;
public class DistanceInYards{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in feet: ");
        float distanceInFeet = sc.nextFloat();
        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
    }
}