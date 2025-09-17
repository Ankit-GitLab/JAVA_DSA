package BinarySearch;

public class PeakIndex {

    public static int peakIndexInMountainArray(int[] arr){
        int  lo = 0, hi = arr.length-1;
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] < arr[mid+1]){
                lo = mid + 1;
            }else{

                hi = mid;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 7, 6, 3, 1};
        System.out.println("Peak Index: " + peakIndexInMountainArray(arr));
    }
}
