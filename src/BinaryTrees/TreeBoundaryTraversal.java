package BinaryTrees;

import java.util.*;

public class TreeBoundaryTraversal {
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.val);
        if(root.left==null && root.right==null) return ans;
        leftBoundary(root.left,ans);
        leafNodes(root,ans);
        rightBoundary(root.right,ans);
        return ans;
    }
    void leftBoundary(Node root, ArrayList<Integer> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        ans.add(root.val);
        if(root.left!=null) leftBoundary(root.left,ans);
        else leftBoundary(root.right,ans);
    }
    void leafNodes(Node root, ArrayList<Integer> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null) ans.add(root.val);
        leafNodes(root.left,ans);
        leafNodes(root.right,ans);
    }
    void rightBoundary(Node root, ArrayList<Integer> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.right!=null) rightBoundary(root.right,ans);
        else rightBoundary(root.left,ans);
        ans.add(root.val);
    }
}
