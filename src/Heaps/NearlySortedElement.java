package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class NearlySortedElement {
    public void nearlySorted(int[] arr, int k) {
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) arr[idx++] = pq.remove();
        }
        while(pq.size()>0) arr[idx++] = pq.remove();
    }
}
