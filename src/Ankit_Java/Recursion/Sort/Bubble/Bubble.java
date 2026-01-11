package Ankit_Java.Recursion.Sort.Bubble;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 3, 5, 4, 8, 9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            // for each step, max item comes at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // Swap if the previous element is smaller (for descending order)
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the arrays is sorted hence stop the program
            if(!swapped){ // ---> swapped == false
                break;
            }
        }
    }
}
