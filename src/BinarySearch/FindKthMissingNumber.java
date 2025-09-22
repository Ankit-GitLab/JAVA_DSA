package BinarySearch;

public class FindKthMissingNumber {
    public static int findKthPositive(int[] arr, int k) {
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int correctNo = mid+1;
            int missing = arr[mid] - correctNo;
            if(missing>=k) hi=mid-1;
            else lo=mid+1;
        }
        return hi+ 1 + k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int result = findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result);
    }
}
