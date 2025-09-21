package BinarySearch;

public class SearchInRotatedArray {
    public static int search(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == tar) return mid;

            else if(arr[lo] <= arr[mid]) {
                if (tar >= arr[lo] && tar < arr[mid])  hi = mid - 1; // search left side
                 else  lo = mid + 1;  // search right side
            }
            // Otherwise, right half must be sorted
            else {
                if (tar > arr[mid] && tar <= arr[hi])  lo = mid + 1;  // search right side
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
