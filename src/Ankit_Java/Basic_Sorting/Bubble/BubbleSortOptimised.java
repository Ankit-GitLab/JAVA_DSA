package Ankit_Java.Basic_Sorting.Bubble;

public class BubbleSortOptimised {
    public static void print(int[] arr) {
        BubbleSort.printBubble(arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        print(arr);

        // Bubble sort optimised code
        for(int i=0; i<n-1; i++){
            int swap = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
        print(arr);
    }
}
