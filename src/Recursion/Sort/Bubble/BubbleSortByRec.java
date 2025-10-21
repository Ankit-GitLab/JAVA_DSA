package Recursion.Sort.Bubble;

import java.util.Arrays;

public class BubbleSortByRec {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr) );
    }


}
