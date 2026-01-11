package Ankit_Java.BinarySearch;
import java.util.Scanner;
import Ankit_Java.Basic_Sorting.Bubble.BubbleSort;

public class Last_Occurrence {
    public static int binarySearch(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1, idx = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > target) {
                hi = mid - 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }


    //sort function
    public static void sort(int[] arr){
        BubbleSort.bubble(arr);
    }
    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number which one you find the number : ");
        int target = sc.nextInt();
        int[] arr = {1, 1, 2, 3, 2, 1};

        // sort the array
        sort(arr);

        int Ans = binarySearch(arr,target);
        if(Ans==-1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found index number is : "+Ans);
        }
        sc.close();
    }
}
