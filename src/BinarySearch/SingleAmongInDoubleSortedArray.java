package BinarySearch;

public class SingleAmongInDoubleSortedArray {
    public static int findOnce(int[] arr){
        int n = arr.length;
        if(n==1 || arr[0] != arr[1]) return arr[0];
        if(arr[n-2] != arr[n-1]) return arr[n-1];
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            int f = mid, s = mid;
            if(arr[mid-1]==arr[mid])f = mid -1;
            else s = mid + 1;
            int leftCount = f - lo;
            int rightCount = hi - s;
            if(leftCount%2==0) lo = s+1;
            else hi = f-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(findOnce(arr));
    }
}
