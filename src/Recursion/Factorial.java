
package Recursion;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        System.out.println(fact(num));
    }
    private static int fact(int n) {
        // base condition
        if(n==0 || n==1) return n;
        return n*fact(n-1);
    }
}
