package Dynamic_Programming.SpaceOptimisedTabulation;

public class NumberOfPath {
    public int numberOfPath(int m, int n){
        if(m==1 || n==1) return 1;
        int[][] dp = new int[2][n];
        for(int j=0; j<n; j++){ // filling 0th row with 1
            dp[0][j] = 1;
        }
        dp[1][0] = 1;

        for(int a=1; a<=m-1; a++){
           // filling first row
            for(int j=1; j<n; j++){
                dp[1][j] = dp[0][j] + dp[1][j-1];
            }
            // copying 1st row to 0th row
            for(int j=1; j<n; j++){
                dp[0][j] = dp[1][j];
            }
        }
        return dp[1][n-1];
    }
}
