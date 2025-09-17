package Assignment.Arrays;

import java.util.Arrays; // for printing array

public class BuildArrayFromPermutation {

    // Function takes int[] nums as input and returns int[] ans
    public static int[] buildArrays(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]]; // main formula
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        System.out.println();
        int[] ans = buildArrays(arr); // fixed here

        // Print result
        System.out.println("Result: " + Arrays.toString(ans));
    }
}
