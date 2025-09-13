package Basic_Sorting.StabilityOfBubble;

import Basic_Sorting.Bubble.BubbleSort;
import Basic_Sorting.Selection.SelectionSort;

public class Basic {
    // print array
    public static void print(int[] arr){
        BubbleSort.printBubble(arr);
    }


    // bubble sort
    public static void bubbleSort(int[] arr){
        BubbleSort.bubble(arr);
    }

    //  selection sort
    public static void selectionSort(int[] arr){
        SelectionSort.sort(arr);
    }

    //main function
    public static void main(String[] args) {
        int[] arr = {1, 23, -1, 45, 23, 21, 0};

        System.out.print("Original array: ");
        print(arr);
        System.out.print("Bubble sort : ");
        bubbleSort(arr);// sort the array
        print(arr);
        selectionSort(arr);
        System.out.print("Selection sort : ");
        print(arr);

    }
}
