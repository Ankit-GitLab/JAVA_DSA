//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package Ankit_Java.Assignment.First_java;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle : ");
        double p = sc.nextInt();
        System.out.print("Enter rate : ");
        double r = sc.nextInt();
        System.out.print("Enter time : ");
        double t = sc.nextInt();
        double SI = (p*r*t)/100;
        System.out.println("Your simple interest is : "+SI);
        sc.close();
    }
}
