package Ankit_Java.Assignment.Arrays;

public class LeetCode_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int i = 0, j = n, k = 0;

        while (i < n && j < 2 * n) {
            result[k++] = nums[i++];
            result[k++] = nums[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        LeetCode_1470 obj = new LeetCode_1470();
        int[] result = obj.shuffle(nums, n);

        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
