package Dynamic_Programming.Memoization;

public class NumberSOfPaths {
    public int numberOfPath(int m, int n){
        int[][] dp = new int[m+1][n+1];
        return paths(m,n,dp);
    }

    private int paths(int m, int n, int[][] dp) {
        if(m==1 || n==1) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        return dp[m][n] = paths(m-1,n,dp) + paths(m,n-1,dp);
    }
}
