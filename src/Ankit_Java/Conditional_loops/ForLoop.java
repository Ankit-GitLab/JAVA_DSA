package Ankit_Java.Conditional_loops;

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            System.out.print(i+" ");
        }
    }
}
