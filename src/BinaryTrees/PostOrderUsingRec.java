package BinaryTrees;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderUsingRec {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size() > 0){
            Node top = st.pop();
            ans.add(top.val);
            if(root.left != null) st.push(top.left);
            if(root.right != null) st.push(top.right);
        }
        return ans;
    }
}
