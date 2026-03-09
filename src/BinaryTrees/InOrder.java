package BinaryTrees;

import java.util.*;

public class InOrder {
    public void dfs(Node root, ArrayList<Integer> ans) {
        if(root==null) return;
        dfs(root.left, ans);
        ans.add(root.val);
        dfs(root.right, ans);
    }
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }
}
