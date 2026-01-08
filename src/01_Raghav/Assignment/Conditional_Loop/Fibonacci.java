package Assignment.Conditional_Loop;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many terms to print
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1; // First two Fibonacci numbers
        int count = 0;    // Counter

        System.out.println("Fibonacci Series:");

        // Print Fibonacci numbers using while loop
        while (count < n) {
            System.out.print(a + " "); // Print current number

            int next = a + b; // Calculate next number
            a = b;            // Move forward
            b = next;

            count++;          // Increase counter
        }

        sc.close();
    }
}
