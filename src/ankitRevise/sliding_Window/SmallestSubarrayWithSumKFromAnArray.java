package ankitRevise.sliding_Window;

public class SmallestSubarrayWithSumKFromAnArray {
    static int smallestSubarraySumK(int[] arr, int k)
    {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; ++i) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    result = Math.min(result, (j - i + 1));
                }
            }
        }
        return result;
    }
}
