package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123456;
        reverse(n);
        System.out.println(sum);
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
