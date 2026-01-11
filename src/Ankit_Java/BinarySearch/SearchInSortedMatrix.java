package Ankit_Java.BinarySearch;

public class SearchInSortedMatrix {
    public static boolean searchMatrix(int[][] arr, int tar) {
        int rows = arr.length, cols = arr[0].length;
        int lo = 0, hi = rows*cols - 1;

        while (lo<=hi) {
           int mid = (lo+hi)/2;
           int midRow = mid/cols, midCol = mid%cols;
           if(arr[midRow][midCol]==tar) return true;
           else if(arr[midRow][midCol]>tar) hi = mid  - 1;
           else lo = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target = 14;

        if (searchMatrix(matrix, target)) {
            System.out.println("Target " + target + " found in matrix");
        } else {
            System.out.println("Target " + target + " not found in matrix");
        }
    }
}
