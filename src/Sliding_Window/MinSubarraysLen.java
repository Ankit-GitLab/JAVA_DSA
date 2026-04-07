package Sliding_Window;

public class MinSubarraysLen {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length, minLen = Integer.MAX_VALUE;
        int i=0, j=0, sum=0;
        while(j<n && sum<target){
            sum += arr[j++];
        }
        j--;
        // sliding window
        while(i<n && j<n){
            int len = j-i+1;
            if(sum>=target) minLen = Math.min(minLen,len);
            sum -= arr[i];
            i++; j++;
            while(j<n && sum<target){
                sum += arr[j++];
            }
            j--;
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;

    }
}
