// Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
// Hint => 
// All the steps are the same as the problem 8 except the marks are stored in a 2D array
// Use the 2D array to calculate the percentages, and grades of the students


import java.util.Scanner;
public class Review {
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
        for(int i = 0; i < students; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + percentages[i] + "\t" + grades[i]);
        }
    }
}
