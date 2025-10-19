package Recursion.Sort.Merge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length-1));
    }
}
