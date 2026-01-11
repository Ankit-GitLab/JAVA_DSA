package Ankit_Java.BinarySearch;

public class SearchInRotatedArray {
    public static int search(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == tar) return mid;

            if(arr[lo] <= arr[mid]) {
                if (tar >= arr[lo] && tar < arr[mid])  hi = mid - 1; // search left side
                 else  lo = mid + 1;  // search right side
            }

            else {
                if (tar <= arr[hi] && tar > arr[mid])  lo = mid + 1;  // search right side
                 else  hi = mid - 1; // search left side
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 9;

        int index = search(arr, key);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
