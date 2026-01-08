package Assignment.Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1};
        int[] ans1 = getConcatenation(nums1);

        System.out.println(Arrays.toString(ans1));
    }
}
