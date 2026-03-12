package BinaryTrees;

public class FlattenBSTToLinkedList {
    public static void flatten(Node root){
        if(root ==null) return;
        Node lst = root.left;
        Node rst = root.right;
        root.left = null;

        flatten(lst);
        flatten(rst);

        root.right = lst;
        Node last = root;
        while(last.right != null) last = last.right;
        last.right = rst;

    }
}
