package Ankit_Java.Recursion.Basic;
import java.util.Scanner;
public class NTo1_And_1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        funBoth(num);
    }
    static void funBoth(int n){
        if(n==0) {
            return;
        }
        System.out.print(n+" ");
        funBoth(n-1);
        System.out.print(n+" ");
    }
}
