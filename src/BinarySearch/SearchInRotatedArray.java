package BinarySearch;

public class SearchInRotatedArray {
    public static int search(int[] arr, int n, int key) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If element is found
            if (arr[mid] == key) {
                return mid;
            }

            // Check if left half is sorted
            if (arr[low] <= arr[mid]) {
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1; // search left side
                } else {
                    low = mid + 1;  // search right side
                }
            }
            // Otherwise, right half must be sorted
            else {
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;  // search right side
                } else {
                    high = mid - 1; // search left side
                }
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = arr.length;
        int key = 10;

        int index = search(arr, n, key);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
