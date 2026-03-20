package Heaps;

import java.util.*;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int max = pq.peek();
            pq.remove();
            int secondMax = pq.peek();
            pq.remove();

            int total = max - secondMax;
            pq.add(total);
        }
        return pq.peek();

    }
}
