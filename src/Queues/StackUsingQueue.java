package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    public void push(int x){
        q.add(x);
        int n = q.size();
        for(int i=1; i<=n-1; i++){
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    // public void push(int x) {
    //     q.add(x);
    // }

    // public int pop() {
    //     int n = q.size();
    //     for(int i=1; i<=n-1; i++){
    //         q.add(q.remove());
    //     }
    //     return q.remove();
    // }

    // public int top() {
    // int n = q.size();
    //     for(int i=1; i<=n-1; i++){
    //         q.add(q.remove());
    //     }
    //     int p = q.peek();
    //     q.add(q.remove());
    //     return p;
    // }

    public boolean empty() {
        return (q.size()==0);
    }
}
