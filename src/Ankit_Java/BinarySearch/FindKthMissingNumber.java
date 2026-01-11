package Ankit_Java.BinarySearch;

public class FindKthMissingNumber {
    public static int findKthPositive(int[] arr, int k) {
        int lo=0, hi=arr.length-1;

        return hi+ 1 + k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 6;
        int result = findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result);
    }
}
