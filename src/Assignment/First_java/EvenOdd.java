//Write a program to print whether a number is even or odd, also take input from the user.
package Assignment.First_java;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(sc.hasNext()) {
            if (num % 2 == 0) {
                System.out.println("Even");
            } else
                System.out.println("Odd");
        }else
            System.out.println("Please enter right number means integer!");
        sc.close();
    }
}
