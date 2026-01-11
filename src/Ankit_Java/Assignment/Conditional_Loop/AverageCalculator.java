package Ankit_Java.Assignment.Conditional_Loop;


import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;

        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();
            sum += num; // add number to sum
        }

        double average = sum / n;
        System.out.println("Average = " + average);

        sc.close();
    }
}

