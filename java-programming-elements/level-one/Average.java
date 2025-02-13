// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
// I/P => NONE
// O/P => Sam’s average mark in PCM is ___ 


public class Average { // Defines the class Average
    public static void main(String[] args) { // Main method, the entry point of the program
        int maths = 94; // Declares and initializes the marks for Mathematics
        int physics = 95; // Declares and initializes the marks for Physics
        int chemistry = 96; // Declares and initializes the marks for Chemistry

        // Calculates the average marks by summing the three subjects and dividing by 3.0 (ensuring decimal precision)
        double average = (maths + physics + chemistry) / 3.0;

        // Prints the calculated average marks
        System.out.println("Sam's average mark in PCM is " + average);
    }
}
