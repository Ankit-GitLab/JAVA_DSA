package BinarySearch;
import java.util.Scanner;
public class DescendingOrder {
    public static int binarySearch(int[] arr,int target){
        int n = arr.length;
        int lo=0, hi=n-1, mid;
        while(lo <= hi){
            mid = (lo + hi) / 2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) lo = mid + 1;
            else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static void sortDescending(int[] arr) {
        int n = arr.length;
        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if next element is bigger
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 1, 2, 3, 2, 1};
        System.out.print("Enter a number which one you find the number : ");
        int target = sc.nextInt();
        sortDescending(arr);

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

    }
}
