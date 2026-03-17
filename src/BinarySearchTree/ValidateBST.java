package BinarySearchTree;
class Pair{
    int max;
    int min;
    Pair(int max,int min){
        this.max = max;
        this.min = min;
    }
}
public class ValidateBST {


    class Solution{
        static boolean flag;

        boolean isBST(Node root){
            flag = true;
            maxMin(root);
            return flag;
        }

        Pair maxMin(Node root){
            if(root == null) return new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);

            Pair lst = maxMin(root.left);
            Pair rst = maxMin(root.right);

            if(lst.max >= root.val || rst.min <= root.val) flag = false;

            int max = Math.max(root.val, Math.max(lst.max, rst.max));
            int min = Math.min(root.val, Math.min(lst.min, rst.min));

            return new Pair(max, min);
        }
    }
}
