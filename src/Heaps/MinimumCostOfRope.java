package Heaps;

import java.util.PriorityQueue;

public class MinimumCostOfRope {
    public static int minCost(int[] arr) {
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);
        }
        while(pq.size()>1){
            int min = pq.poll();
            int secondMin = pq.poll();

            int total = min + secondMin;
            cost += total;
            pq.add(total);
        }
        return cost;
    }
}
