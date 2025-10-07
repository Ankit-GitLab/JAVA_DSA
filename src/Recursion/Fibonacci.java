package Recursion;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            System.out.print(fiboFormula(i)+" ");
        }
    }

    static int fiboFormula(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2), n));
    }
    static int fibo(int n){
        // base condition
        if(n==0 || n==1) return n;

        return fibo(n-1) + fibo(n-2);
    }
}
