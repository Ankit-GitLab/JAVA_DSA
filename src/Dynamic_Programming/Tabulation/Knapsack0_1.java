package Dynamic_Programming.Tabulation;

public class Knapsack0_1 {
    public int knapsack(int capacity, int val[], int wt[]) {
        int n = val.length;
        int[][] dp = new int[n][capacity+1];
        return helper(0,capacity,val,wt,dp);
    }

    static int helper(int i, int capacity, int[] val, int[] wt, int[][] dp) {
        if(i==val.length) return 0;
        if(dp[i][capacity]!=0) return dp[i][capacity];
        int skip = helper(i+1,capacity,val,wt,dp);
        if(capacity<wt[i]) return dp[i][capacity] = skip;
        int pick = val[i] + helper(i+1,capacity-wt[i],val,wt,dp);
        return dp[i][capacity] = Math.max(pick,skip);
    }
}
