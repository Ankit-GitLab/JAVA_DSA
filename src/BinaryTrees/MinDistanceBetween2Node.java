package BinaryTrees;

public class MinDistanceBetween2Node {
    int findDist(Node root, int a, int b) {
        Node LCA = lca(root,a,b);
        int[] dis = {0,0};
        dfs(LCA,a,b,0,dis);
        return dis[0] + dis[1];
    }

    private void dfs(Node root, int a, int b, int depth, int[] dis) {
        if(root==null) return;
        if(root.val == a) dis[0] = depth;
        if(root.val == b) dis[1] = depth;
        dfs(root.left,a,b,depth+1,dis);
        dfs(root.right,a,b,depth+1,dis);
    }

    Node lca(Node root, int p, int q) {
        if(root==null) return null;
        if(root.val==p || root.val==q) return root;
        Node l = lca(root.left,p,q);
        Node r = lca(root.right,p,q);
        if(l!=null && r!=null) return root;
        return (l==null) ? r : l;
    }
}
