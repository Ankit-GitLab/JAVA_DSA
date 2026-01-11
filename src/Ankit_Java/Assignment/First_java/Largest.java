// Take 2 numbers as input and print the largest number.
package Ankit_Java.Assignment.First_java;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        if (num1 > num2) {
            System.out.println("First number is greater: " + num1);
        }
        else if (num2 > num1) {
            System.out.println("Second number is greater: " + num2);
        }
        else {
            System.out.println("Both numbers are equal: " + num1);
        }

        sc.close();
    }
}
