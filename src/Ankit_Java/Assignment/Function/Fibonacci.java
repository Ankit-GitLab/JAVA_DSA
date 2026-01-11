package Ankit_Java.Assignment.Function;
import java.util.Scanner;
public class Fibonacci {
    // Recursive function to calculate Fibonacci number
    public static int fibonacci(int n) {
        if(n == 0 || n == 1) return n;    // base case 1

        return fibonacci(n - 1) + fibonacci(n - 2); // recursion step
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        System.out.print("Fibonacci Series: ");
        for(i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
