package BinaryTrees;

public class DiameterOfBT {
    static int max;
    int diameter(Node root){
        max = 0;
        levels(root);
        return max;
    }

    int levels(Node root) {
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        max = Math.max(max, leftLevels+rightLevels);
        return 1+ Math.max(leftLevels,rightLevels);
    }
}
