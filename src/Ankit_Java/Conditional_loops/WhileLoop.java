package Ankit_Java.Conditional_loops;
import java .util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        while(num <= 5 ){
            System.out.print(num+" ");
            num++;
        }

    }
}
