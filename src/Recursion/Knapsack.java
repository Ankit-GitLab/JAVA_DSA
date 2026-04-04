package Recursion;

public class Knapsack {
    public int knapsack(int capacity, int val[], int wt[]) {
        return helper(0,capacity,val,wt);
    }

    private int helper(int i, int capacity, int[] val, int[] wt) {
        if(i==val.length){
            if(capacity>=0) return 0;
            else return Integer.MIN_VALUE;
        }
        int pick = val[i] + helper(i+1,capacity-wt[i],val,wt);
        int skip = helper(i+1,capacity,val,wt);
        return Math.max(pick,skip);
    }
}
