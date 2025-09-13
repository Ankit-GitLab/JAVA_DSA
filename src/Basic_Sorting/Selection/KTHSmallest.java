package Basic_Sorting.Selection;
import java.util.Scanner;
public class KTHSmallest {
    //to find the Kth number
    public static int KthSmallest(int[] arr, int k){
       int min =
    }

    public static void print(int[] arr){
        SelectionSort.printSelection(arr);
    }

    public static int[] sort(int[] arr){
        SelectionSort.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Kth number : ");
        int k = sc.nextInt();
        int[] arr = {1, 23, -1, 45, 23, 21, 0};

        System.out.print("Original array: ");
        print(arr);

       sort(arr); // sort the array


    }
}
