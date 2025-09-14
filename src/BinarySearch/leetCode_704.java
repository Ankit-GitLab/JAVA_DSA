package BinarySearch;
import Basic_Sorting.Insertion.InsertionSort;

import java.rmi.dgc.VMID;
import java.util.Scanner;
public class leetCode_704 {
    public static int search(int[] arr, int target){
        int n = arr.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = (lo + hi) / 2;
            if(arr[mid]==target) return mid;
            else if(arr[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    // sort the array
    public static void sort(int[] arr){
        InsertionSort.insert(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find the element : ");
        int target = sc.nextInt();
        int[] arr = {12, 34, 45, 11, 10, 9, 8};
        sort(arr);
        int Ans = search(arr, target);
        if(Ans==-1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found index number is : "+Ans);
        }
        sc.close();
    }
}
