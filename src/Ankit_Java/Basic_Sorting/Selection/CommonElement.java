package Ankit_Java.Basic_Sorting.Selection;

import java.util.ArrayList;

public class CommonElement {

    //common element
    public static ArrayList<Integer> commonElement(int[] arr1, int[] arr2){
        int i=0, j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]<arr2[j]) i++;
            else j++;
        }
        return ans;
    }
    //print the array
    public static void print(int[] arr){
        SelectionSort.printSelection(arr);
    }

    //sort the array
    public static void sort(int[] arr){
        SelectionSort.sort(arr);
    }

    // main function
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6, 4, 9};
        int[] arr2 = {1, 7, 5, 10, 4, 2};

        //print original array
        System.out.print("Original array first : ");
        print(arr1);
        sort(arr1);
//        System.out.print("Sort array first : ");
//        print(arr1);
        System.out.print("Original array second : ");
        print(arr2);
        sort(arr2);
//        System.out.print("Sort array second : ");
//        print(arr2);

        //common element store
        ArrayList<Integer> common = commonElement(arr1, arr2);
        System.out.println("Common Elements : "+common);

    }
}
