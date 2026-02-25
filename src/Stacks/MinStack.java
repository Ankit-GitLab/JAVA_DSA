package Stacks;

import java.util.Stack;

public class MinStack {
    class minStack {
        Stack<Integer> st;
        Stack<Integer> minSt;
        public minStack() {
            st = new Stack<>();
            minSt = new Stack<>();
        }

        public void push(int val) {
            st.push(val);
            if(minSt.size()==0 || val < minSt.peek()) minSt.push(val);
            else minSt.push(minSt.peek());
        }

        public void pop() {
            st.pop();
            minSt.pop();
        }

        public int top() { // peek
            return st.peek();
        }

        public int getMin() {
            return minSt.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
