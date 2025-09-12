package Basic_Sorting.Bubble;

public class BubbleSort {
    public static void printBubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        printBubble(arr);

        // Bubble sort optimised code
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printBubble(arr);
    }
}
