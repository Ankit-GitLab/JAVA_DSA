package Ankit_Java.Recursion.Basic;

public class CountZero {
    public static void main(String[] args) {
        int num = 102034;
        System.out.println(count(num, 0));
    }
    // special pattern, how to pass a value to above calls
    static int count(int num , int digit) {
        int rem = num % 10;
        if (num == 0) {
            return digit;
        }
        if(rem == 0) {
                return count(num / 10, digit+1);
        }else{
                return count(num / 10, digit);
        }
//        return digit;
    }
}
