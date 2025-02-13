// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height
// I/P => base, height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;
public class AreaOFTriangle {
    public static void main(String[] args) {
        double base, height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        base = input.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        height = input.nextDouble();
        double areaInSquareInches = 0.5 * base * height;
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;
        System.out.println("The area of the triangle in square inches is " + areaInSquareInches + " and in square centimeters is " + areaInSquareCentimeters);
    }
}