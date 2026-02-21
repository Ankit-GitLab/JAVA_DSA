package Stacks;

import java.util.Stack;

public class BasicSTLOfStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
        st.push("Ankit");
        st.push("Ravi");
        st.push("Vishal");
        st.push("Shrimp");
        st.push("Amit");
        System.out.println(st.size());
        System.out.println(st); // A.S = 0(n)
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); // it returns the top most element and them remove it
        String s = st.pop();
    }
}
