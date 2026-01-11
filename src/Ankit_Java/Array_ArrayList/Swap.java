package Ankit_Java.Array_ArrayList;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println();
        swap(arr, 1, 3);

        for(int a: arr){
            System.out.print(a+" ");
        }
    }
    static void swap(int[] arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] =arr[index2];
        arr[index2] = temp;
    }
}
