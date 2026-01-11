package Ankit_Java.BinarySearch;
import java.util.Scanner;
public class SortedArraySearch {
    public static boolean searchInSorted(int[] arr, int k){
        int lo=0, hi= arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi) / 2;
            if(arr[mid]>k) hi = mid-1;
            else if(arr[mid]<k) lo = mid-1;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number which one you find : ");
        int target = sc.nextInt();
        int[] arr = {1,3,5,7,8,9,11,16};
        boolean result = searchInSorted(arr, target);
        if (result == true) {
            System.out.println("Yes found target");
        } else {
            System.out.println("Not found target!");
        }
        sc.close();
    }
}
