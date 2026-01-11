package Ankit_Java.Assignment.Conditional_Loop;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int product = 1;
        for(int i=1; i<=num; i++){
            product *= i;
        }

        System.out.print(product);
        sc.close();
    }
}
