package Dynamic_Programming.SpaceOptimisedTabulation;

public class CountFriendPairing {
    public long countFriendsPairings(int n) {
        if(n<=1) return n;
        return countFriendsPairings(n-1) + (n-1)*countFriendsPairings(n-2);
    }
}
