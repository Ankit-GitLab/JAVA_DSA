package BinarySearch;
import java.util.Scanner;
import Basic_Sorting.Bubble.BubbleSort;

public class floorInSortedArray {
    public static int sortedInFloor(int[] arr, int x){
        int lo = 0, hi = arr.length-1, idx = -1;
        while(lo<=hi){
            int mid = (lo+hi) / 2;
            if(mid > x) hi = mid - 1;
            else {
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }
    public static void sort(int[] arr){
        BubbleSort.bubble(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,8,7,6};
        sort(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int result = sortedInFloor(arr,num);
        System.out.println("Your Sorted floor is : "+result);
    }
}
