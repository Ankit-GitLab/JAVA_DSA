package BinaryTrees;

public class MaxAndMin {
    public static int findMax(Node root) {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(findMax(root.left),findMax(root.right)));

    }

    public static int findMin(Node root) {
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(findMin(root.left),findMin(root.right)));
    }
}
