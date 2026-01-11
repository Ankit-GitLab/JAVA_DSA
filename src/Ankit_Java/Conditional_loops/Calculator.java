package Ankit_Java.Conditional_loops;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ans = 0;
        int num1;
        int num2;
        char op;

        while (true) {
            System.out.print("Enter first number : ");
            num1 = sc.nextInt();
            System.out.print("Enter an operator (or 'x' to exit) : ");
            op = sc.next().trim().charAt(0);

            // Check if user wants to exit
            if (op == 'x' || op == 'X') {
                System.out.println("Calculator exited. Goodbye!");
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter second number : ");
                num2 = sc.nextInt();

                // Perform calculation
                if (op == '+') {
                    Ans = num1 + num2;
                } else if (op == '-') {
                    Ans = num1 - num2;
                } else if (op == '*') {
                    Ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        Ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue; // Skip to next iteration
                    }
                } else {
                    if (num2 != 0) {
                        Ans = num1 % num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue; // Skip to next iteration
                    }
                }

                // Display result
                System.out.println(num1 + " " + op + " " + num2 + " = " + Ans);
            } else {
                System.out.println("Enter a valid operator (+, -, *, /, %) 😁");
            }
        }
        sc.close();
    }
}