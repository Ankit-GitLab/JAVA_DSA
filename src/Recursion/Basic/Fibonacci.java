package Recursion.Basic;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            System.out.print(fibo(i)+" ");
        }
    }
    
    static int fibo(int n){
        // base condition
        if(n==0 || n==1) return n;

        return fibo(n-1) + fibo(n-2);
    }
}
