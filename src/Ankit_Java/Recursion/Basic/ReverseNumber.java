package Ankit_Java.Recursion.Basic;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(rev2(n));
    }
    static int rev2(int n){
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
         if (n%10 == n){
            return n;
        }
         int rem = n % 10;
         return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits - 1);
    }

    static int sum = 0;
    static void reverse(int n) {
        int lastDigit = (n%10);
        if(n==0){
            return;
        }
        sum = sum * 10 + lastDigit ;
        reverse(n/10);
    }
}
