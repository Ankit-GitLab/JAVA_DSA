package Recursion;

public class CountZero {
    public static void main(String[] args) {
        int num = 102034;
        int digit = 0;
        System.out.println(count(num, digit));
    }

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
