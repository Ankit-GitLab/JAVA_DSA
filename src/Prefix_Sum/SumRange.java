package Prefix_Sum;

import java.util.*;

public class SumRange {
    class NumArray {
        int[] arr;
        public NumArray(int[] nums) {
            arr = Arrays.copyOf(nums,nums.length);
            for(int i=1; i<nums.length;i++){
                arr[i] += arr[i-1];
            }
        }

        public int sumRange(int left, int right) {
            if(left==0) return arr[right];
            return arr[right] - arr[left-1];
        }
    }
}
