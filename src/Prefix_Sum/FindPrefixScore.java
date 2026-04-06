package Prefix_Sum;

public class FindPrefixScore {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];

        long max = 0;
        long sum = 0;

        for(int i=0;  i<n; i++){
            max = Math.max(max,nums[i]);
            long val = nums[i] + max;
            sum += val;
            result[i] = sum;
        }
        return result;
    }
}
