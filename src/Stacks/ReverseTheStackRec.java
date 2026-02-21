package Stacks;

import java.util.Stack;

public class ReverseTheStackRec {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);

        reverseTheStack(st);
        System.out.println(st);
    }

    private static void reverseTheStack(Stack<Integer> st) {
        if(st.size() == 1) return;

        int top = st.pop();
        reverseTheStack(st); // this is the magic part
        insertAtBottom(st, top);
    }

    private static void insertAtBottom(Stack<Integer> st, int ele) {
        if(st.isEmpty()){
            st.push(ele);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, ele);
        st.push(top);
    }
}
