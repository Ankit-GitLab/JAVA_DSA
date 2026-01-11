package Ankit_Java.Basic_Sorting.Selection;

public class SelectionSort {

    // Function to print array
    public static void printSelection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to perform selection sort
    public static int[] sort(int[] arr) {
        int n = arr.length;

        // Outer loop -> fix one position at a time
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE; // assume the biggest possible
            int mIndex = -1; // store index of minimum element
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mIndex];
            arr[mIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, -1, 45, 23, 21, 0};

        System.out.println("Original array:");
        printSelection(arr);

       sort(arr); // sort the array

        System.out.println("Sorted array:");
        printSelection(arr);
    }
}
