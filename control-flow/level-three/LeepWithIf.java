// Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators


import java.util.Scanner;
public class LeepWithIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        sc.close();
        if (year >= 1582 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("The year is a Leap Year");
        } else {
            System.out.println("The year is not a Leap Year");
        }
    }
}