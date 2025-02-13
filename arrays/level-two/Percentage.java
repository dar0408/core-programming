// Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

// Hint => 
// Take input for the number of students
// Create arrays to store marks, percentages, and grades of the students
// Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
// Calculate the percentage and grade of the students based on the percentage
// Display the marks, percentages, and grades of each student

import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int students = sc.nextInt();
        double[][] marks = new double[students][3];
        double[] percentages = new double[students];
        String[] grades = new String[students];
        for (int i = 0; i < students; i++) {
            System.out.println("Enter the marks of student " + (i + 1) + " in physics");
            marks[i][0] = sc.nextDouble();
            while (marks[i][0] < 0) {
                System.out.println("Enter a positive value for marks");
                marks[i][0] = sc.nextDouble();
            }
            System.out.println("Enter the marks of student " + (i + 1) + " in chemistry");
            marks[i][1] = sc.nextDouble();
            while (marks[i][1] < 0) {
                System.out.println("Enter a positive value for marks");
                marks[i][1] = sc.nextDouble();
            }
            System.out.println("Enter the marks of student " + (i + 1) + " in maths");
            marks[i][2] = sc.nextDouble();
            while (marks[i][2] < 0) {
                System.out.println("Enter a positive value for marks");
                marks[i][2] = sc.nextDouble();
            }
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80 && percentages[i] < 90) {
                grades[i] = "B";
            } else if (percentages[i] >= 70 && percentages[i] < 80) {
                grades[i] = "C";
            } else if (percentages[i] >= 60 && percentages[i] < 70) {
                grades[i] = "D";
            } else if (percentages[i] >= 50 && percentages[i] < 60) {
                grades[i] = "E";
            } else {
                grades[i] = "F";
            }
        }
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < students; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + percentages[i] + "\t" + grades[i]);
        }   
    }
}
