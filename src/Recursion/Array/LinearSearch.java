package Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,7,9};
        int target = 5;
        System.out.println("index number is : "+findIndex(arr, target, 0));
        System.out.println("index number is : "+find(arr, target, 0));
        System.out.println("index number is : "+findLastIndex(arr, target, arr.length-1));
       // findAllIndex(arr,4,0);
       // System.out.println(list);
        int[] arr1;
        System.out.println(findAllIndex(arr,4,0, new ArrayList<>()));

    }
    // print index
    static int findIndex(int[] arr, int target, int index) {
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] != target){
            return findIndex(arr, target, index+1);
        }else{
            return index;
        }
    }

    static int findLastIndex(int[] arr, int target, int index) {
        if(index == -1){
            return -1;
        }
        if(arr[index] != target){
            return findLastIndex(arr, target, index-1);
        }else{
            return index;
        }
    }

    // print true or false
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length-1) return false;
        return arr[index] == target || find(arr, target, index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length-1){
            return;
        }
        if(arr[index] != target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }
}
