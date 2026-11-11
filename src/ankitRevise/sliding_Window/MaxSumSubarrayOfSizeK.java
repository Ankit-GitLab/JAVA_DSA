package ankitRevise.sliding_Window;

public class MaxSumSubarrayOfSizeK {
    public int maxSubarraySum(int[] arr, int k) {
        int low = 0, high = k - 1, sum = 0;
        int n = arr.length;
        int res = Integer.MIN_VALUE;

        for (int i = 0; i <= high; i++) {
            sum += arr[i];
        }

        res = sum;

        while (high < n - 1) {
            low++;
            high++;

            sum -= arr[low - 1];
            sum += arr[high];

            res = Math.max(res, sum);
        }

        return res;
    }
}
