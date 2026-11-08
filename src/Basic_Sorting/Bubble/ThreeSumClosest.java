package Basic_Sorting.Bubble;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int resultSum = nums[0] + nums[1] + nums[2];
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                int diff = Math.abs(sum - target);

                if (diff < minDiff) {
                    minDiff = diff;
                    resultSum = sum;
                }

                if (sum == target) {
                    return sum;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return resultSum;
    }
}
