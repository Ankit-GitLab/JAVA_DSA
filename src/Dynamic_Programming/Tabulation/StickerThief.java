package Dynamic_Programming.Tabulation;

import java.util.Arrays;

public class StickerThief {
    public int findMaxSum(int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        if(n>1) dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2; i<n; i++){
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}
