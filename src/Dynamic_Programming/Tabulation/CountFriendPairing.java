package Dynamic_Programming.Tabulation;

public class CountFriendPairing {
    public long countFriendsPairings(int n) {
        long[] dp = new long[n+1];
        return friends(n,dp);
    }

    private long friends(int n, long[] dp) {
        if(n<=2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = countFriendsPairings(n-1) + (n-1)*countFriendsPairings(n-2);

    }
}
