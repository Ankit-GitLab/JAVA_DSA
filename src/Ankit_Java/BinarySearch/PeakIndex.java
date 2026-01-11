package Ankit_Java.BinarySearch;

public class PeakIndex {

    public static int peakIndexInMountainArray(int[] arr){
        int  lo = 1, hi = arr.length-2;
        while(lo <=  hi){
            int mid = (lo + hi) / 2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]) lo = mid+1;
            else hi = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 7, 6, 3, 1};
        System.out.println("Peak Index: " + peakIndexInMountainArray(arr));
    }
}
