//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package Ankit_Java.Assignment.First_java;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        float result = 0;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Addition: " + result);
        }
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Subtraction: " + result);
        }
        else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Multiplication: " + result);
        }
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Division: " + result);
            } else {
                System.out.println("Error: Cannot divide by zero!");
            }
        }
        else {
            System.out.println("Invalid operator!");
        }

        sc.close();
    }
}