package BinaryTrees;

public class ConstructTreeFromPreAndIn {
        public static Node buildTree(int inorder[], int preorder[]) {
            int n = inorder.length;
            return build(0,n-1,0,n-1,inorder,preorder);
        }
        public static Node build(int preLo, int preHi, int inLo, int inHi, int inorder[], int preorder[]) {
            if(preLo > preHi || inLo > inHi) return null;
            int val = preorder[preLo];
            Node root = new Node(val);
            int r = 0;
            for(int i=inLo;i<=inHi;i++){
                if(inorder[i]==val){
                    r = i;
                    break;
                }
            }
            int cnt = r - inLo;
            root.left = build(preLo+1,preLo+cnt,inLo,r-1,inorder,preorder);
            root.right = build(preLo+cnt+1,preHi,r+1,inHi,inorder,preorder);
            return root;
        }

}
