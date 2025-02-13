// Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

// Hint => 
// Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks



import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Physics: ");
        float physics = sc.nextFloat();
        System.out.println("Enter the marks of Chemistry: ");
        float chemistry = sc.nextFloat();
        System.out.println("Enter the marks of Maths: ");
        float maths = sc.nextFloat();
        sc.close();
        float percentage = (physics + chemistry + maths) / 3;
        System.out.println("The percentage is: " + percentage);
        if (percentage >= 40) {
            if (percentage >= 70) {
                System.out.println("The grade is A");
            } else if (percentage >= 60) {
                System.out.println("The grade is B");
            } else if (percentage >= 50) {
                System.out.println("The grade is C");
            } else {
                System.out.println("The grade is D");
            }
        } else {
            System.out.println("The grade is F");
        }
    }
}