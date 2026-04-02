package Dynamic_Programming.Tabulation;

public class UniquePath_2 {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];

        dp[0] = (grid[0][0] == 0) ? 1 : 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    dp[j] = 0;
                } else if(j > 0){
                    dp[j] += dp[j-1];
                }
            }
        }

        return dp[n-1];
    }
}
