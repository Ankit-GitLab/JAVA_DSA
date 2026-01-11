//To calculate Fibonacci Series up to n numbers.
package Ankit_Java.Assignment.First_java;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int first = 0, second = 1, next;

        for(int i=1; i<=num; i++){
            System.out.print(first+" ");
            next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
