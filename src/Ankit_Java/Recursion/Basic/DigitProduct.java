package Ankit_Java.Recursion.Basic;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = prod(55);
        System.out.println("The sum of digit is: "+ans);
    }

    static int prod(int n) {
        if(n%10 == n) return n;
        return (n%10) * prod(n/10);
    }
}
