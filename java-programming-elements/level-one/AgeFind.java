// Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
// I/P => NONE
// O/P => Harry's age in 2024 is ___ 



public class AgeFind { // Defines a class named AgeFind
    public static void main(String[] args) { // Main method, the entry point of the program
        int birthYear = 2000; // Declares and initializes a variable for the birth year
        int currentYear = 2024; // Declares and initializes a variable for the current year
        int age = currentYear - birthYear; // Calculates the age by subtracting birth year from current year
        System.out.println("Harry's age in 2024 is " + age); // Prints the calculated age
    }
}
