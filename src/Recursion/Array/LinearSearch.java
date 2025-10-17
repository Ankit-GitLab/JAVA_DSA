package Recursion.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        int target = 5;
        System.out.println("index number is : "+search(arr, target, 0));
    }

    static int search(int[] arr, int target, int index) {
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] != target){
            return search(arr, target, index+1);
        }else{
            return index;
        }
    }
}
