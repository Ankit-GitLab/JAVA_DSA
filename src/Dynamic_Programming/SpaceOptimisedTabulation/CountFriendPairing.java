package Dynamic_Programming.SpaceOptimisedTabulation;

public class CountFriendPairing {
    public long countFriendsPairings(int n) {
        if(n <= 2) return n;

        long prev2 = 1; // f(1)
        long prev1 = 2; // f(2)

        for(int i = 3; i <= n; i++){
            long curr = prev1 + (i - 1) * prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }


//    public long countFriendsPairings(int n) {
//        long[] dp = new long[n+1];
//        return friends(n,dp);
//    }
//
//    private long friends(int n, long[] dp) {
//        if(n<=2) return n;
//        if(dp[n]!=0) return dp[n];
//        return dp[n] = countFriendsPairings(n-1) + (n-1)*countFriendsPairings(n-2);
//
//    }
}
