package LinearSearchAlgorithm;
// 1672 ---> https://leetcode.com/problems/richest-customer-wealth/description/
public class maximumWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        // person = row,   account = column
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            //now we have sum of account of person
            //check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
