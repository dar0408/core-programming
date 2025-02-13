// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height
// I/P => base, height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is __


import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of the triangle: ");
        float base = sc.nextFloat();

        System.out.println("Enter the height of the triangle: ");
        float height = sc.nextFloat();

        // Calculate the area of the triangle using the formula: (1/2) * base * height
        float areaInSqInches = 0.5f * base * height;

        // Convert the area from square inches to square centimeters (1 sq inch = 6.4516 sq cm)
        float areaInSqCm = areaInSqInches * 6.4516f;

        System.out.println("The area of the triangle in square inches is " + areaInSqInches + 
                " and in square centimeters is " + areaInSqCm);
    }
}
