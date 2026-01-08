package Recursion.Basic;
import java.util.Scanner;
public class Nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        fun(num);
    }
    static void fun(int n){
        if(n==1) {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }
}
