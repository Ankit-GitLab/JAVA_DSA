package Recursion.Array;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 4, 5};
        System.out.println(sort(arr, 0));
    }

    static boolean sort(int[] arr, int index) {
        // Base case: if j reaches the last index, array is sorted
        if (index == arr.length - 1) {
            return true;
        }
        // check the array is sorted or not
        return arr[index] < arr[index+1] && sort(arr, index+1);
    }
}
