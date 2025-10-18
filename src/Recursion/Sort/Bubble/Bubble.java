package Recursion.Sort.Bubble;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1,2,7,3,5,4,8,9};
        bubbleSort(arr);
        System.out.println(arr);
    }

    static void bubbleSort(int[] arr){
        // run the steps n-1 times
        for(int i=0; i<arr.length; i++){
            // for each step, max item come at the last respective index
            for(int j=0; j<arr.length-i; j++)
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
        }
    }
}
