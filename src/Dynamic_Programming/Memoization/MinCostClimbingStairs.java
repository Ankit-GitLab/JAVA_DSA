package Dynamic_Programming.Memoization;

import java.util.*;

public class MinCostClimbingStairs {
    static int[] dp;
    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(0,cost),minCost(1,cost));
    }

    private static int minCost(int i, int[] cost) {
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i] = cost[i] + Math.min(minCost(i+1,cost),minCost(i+2,cost));
    }
}
