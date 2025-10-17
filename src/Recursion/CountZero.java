package Recursion;

public class CountZero {
    public static void main(String[] args) {
        int num = 102034;
        System.out.println(count(num));
    }

    static int count(int num) {
        int count = 0;
        int rem = num % 10;

        if(rem == 10){
            count++;
            return count(num/10);
        }
        return count;
    }
}
