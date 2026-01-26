package Recursion.Basic;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sum(234345);
        System.out.println("The sum of digit is: "+ans);
    }
    static int sum(int n) {
        if (n == 0) return 0;
        return (n % 10) + sum(n / 10);
    }
}
