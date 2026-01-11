package Ankit_Java.Recursion.Basic;
import java.util.Scanner;
public class OneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        funReverse(num);
    }
    static void funReverse(int n){
        if(n==0) {
            return;
        }
        funReverse(n-1);
        System.out.print(n+" ");
    }
}
