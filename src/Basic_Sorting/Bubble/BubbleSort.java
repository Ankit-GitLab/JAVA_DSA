package Basic_Sorting.Bubble;

public class BubbleSort {
    public static void printBubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // Bubble sort
    public static void bubble(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        System.out.print("Original Array : ");
        printBubble(arr);
        bubble(arr);
        System.out.print("After bubble sort : ");
        printBubble(arr);
    }
}
