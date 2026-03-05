package Queues;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public Queue<Integer> reverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(st.size() > 0){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        return q;
    }
}
