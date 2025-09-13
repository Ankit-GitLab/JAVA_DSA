package Basic_Sorting.Selection;
import java.util.Scanner;
public class KTHSmallest {
    //to find the Kth number
    public static int KthSmallest(int[] arr, int k){
        return arr[k-1];
    }

    public static void print(int[] arr){
        SelectionSort.printSelection(arr);
    }

    public static void sort(int[] arr){
        SelectionSort.sort(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Kth number : ");
        int k = sc.nextInt();
        int[] arr = {1, 23, -1, 45, 23, 21, 0};

        System.out.print("Original array: ");
        print(arr);

       sort(arr); // sort the array

        int Ans = KthSmallest(arr,k);
        System.out.println(k+" th number is : "+Ans);

        sc.close();
    }
}
