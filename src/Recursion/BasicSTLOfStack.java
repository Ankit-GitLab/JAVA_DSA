package Recursion;

import java.io.FilterOutputStream;
import java.util.Stack;

public class BasicSTLOfStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Ankit");
        st.push("Ravi");
        st.push("Vishal");
        st.push("Shrimp");
        st.push("Amit");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}
