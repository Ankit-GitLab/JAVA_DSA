package Ankit_Java.BinarySearch;
import java.util.Scanner;
public class SquareRootInBinarySearch {
    static int floorSqrt(int n){
        if(n==0) return 0;
        int lo=1, hi=n;
        while(lo<=hi) {
            int mid = lo+(hi-lo) / 2;
            if (mid == n/mid) return mid;
            else if (mid > n/mid) hi = mid - 1;
            else lo = mid + 1;
        }
        return hi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Floor square root of " + n + " is: " +floorSqrt(n));
    }
}
