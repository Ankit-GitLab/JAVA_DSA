package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class ReArrangQueue {
    public void rearrangeQueue(Queue<Integer> q) {
        int n = q.size();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i=1; i<=n/2; i++){
            q2.add(q.remove());
        }
        for(int i=1; i<=n/2; i++){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
}
