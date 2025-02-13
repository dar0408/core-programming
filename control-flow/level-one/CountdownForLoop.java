// Rewrite program 8 to do the countdown using the for-loop


import java.util.Scanner;
public class CountdownForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int counter = sc.nextInt();
        for(int i = counter; i > 0; i--){
            System.out.println(i);
        }
    }
}