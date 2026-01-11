package Ankit_Java.Assignment.Conditional_Loop;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Take first number as input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Take second number as input
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Add two numbers
        int sum = num1 + num2;

        // Print result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close(); // Close Scanner
    }
}
