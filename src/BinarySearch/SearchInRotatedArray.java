package BinarySearch;

public class SearchInRotatedArray {
    public static int search(int[] arr, int key) {
        int n = arr.length;
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // If element is found
            if (arr[mid] == key) {
                return mid;
            }

            // Check if left half is sorted
            if (arr[lo] <= arr[mid]) {
                if (key >= arr[lo] && key < arr[mid]) {
                    hi = mid - 1; // search left side
                } else {
                    lo = mid + 1;  // search right side
                }
            }
            // Otherwise, right half must be sorted
            else {
                if (key > arr[mid] && key <= arr[hi]) {
                    lo = mid + 1;  // search right side
                } else {
                    hi = mid - 1; // search left side
                }
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;

        int index = search(arr, key);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
