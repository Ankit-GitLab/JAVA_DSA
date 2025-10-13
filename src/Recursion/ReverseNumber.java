package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(reverse(n));
    }

    static int reverse(int n) {
        int Reverse = 0;
        if(n==0) return 0;
        Reverse = (n%10) * 10;
        reverse(n/10);
        return Reverse;
    }
}
