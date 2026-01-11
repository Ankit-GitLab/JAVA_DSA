package Ankit_Java.Recursion.Sort.Quick;

public class QuickSort {
    public static void main(String[] args) {

    }
    static void sort(int[] nums, int low, int hi){
        if(low >= hi){
            return;
        }

        int s = low;
        int e = hi;
        int mid = s+(e-s)/2;
        int pivot = nums[mid];

        while(s <= e){

            // also a reason why if its already sorted it will not swap
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s <= e){

            }
        }
    }
}
