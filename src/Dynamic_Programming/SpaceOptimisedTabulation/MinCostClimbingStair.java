package Dynamic_Programming.SpaceOptimisedTabulation;

public class MinCostClimbingStair {
    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[3];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < n; i++){
            dp[2] = cost[i] + Math.min(dp[0], dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }

        return Math.min(dp[0], dp[1]);
    }
}
