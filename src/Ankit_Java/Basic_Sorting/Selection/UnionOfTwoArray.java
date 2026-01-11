package Ankit_Java.Basic_Sorting.Selection;

import java.util.ArrayList;

public class UnionOfTwoArray {
    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                add(result, arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                add(result, arr2[j]);
                j++;
            } else { // equal case
                add(result, arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) add(result, arr1[i++]);
        while (j < arr2.length) add(result, arr2[j++]);

        return result;
    }

    public static void print(int[] arr){
        SelectionSort.printSelection(arr);
    }

    private static void add(ArrayList<Integer> list, int val) {
        if (list.isEmpty() || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 5};
        int[] arr2 = {2, 3, 4, 6};
        System.out.print("First Array : ");
        print(arr1);
        System.out.print("Second Array : ");
        print(arr2);
        System.out.println(union(arr1, arr2));
    }
}
