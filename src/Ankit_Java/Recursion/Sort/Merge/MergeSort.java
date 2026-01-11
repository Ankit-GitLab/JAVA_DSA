package Ankit_Java.Recursion.Sort.Merge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        // Base case: if array has only one element, it's already sorted
        if(arr.length == 1){
            return arr;
        }

        // Find the middle index
        int mid = arr.length / 2;

        // Recursively sort the left and right halves
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the two sorted halves
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for mixed array

        // Compare elements from both arrays and add the smaller one
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from first array (if any)
        while (i < first.length ){
            mix[k] = first[i];
            i++;
            k++;
        }

        // Copy remaining elements from second array (if any)
        while (j < second.length ){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
