package Maps_And_Sets;
import java.util.*;
public class BurningTree {
    static Node start;
    static HashMap<Node,Node> map;
    public int minTime(Node root, int target) {
        start = null;
        map = new HashMap<>();
        dfs(root,target);
        return -1;
    }

    private void dfs(Node root, int target) {
        if(root==null) return;
        if(root.data==target) start=root;
        dfs(root.left,target);
        dfs(root.right,target);
    }
}
