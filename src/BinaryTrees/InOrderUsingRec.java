package BinaryTrees;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderUsingRec {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(st.size() > 0 || curr != null){
            if(curr != null){
                if(curr.left != null) {
                    st.push(curr);
                    curr = curr.left;
                }
                else{
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                Node top = st.pop();
                ans.add(top.val);
                curr = top.right;
            }
        }
        return ans;
    }
}
