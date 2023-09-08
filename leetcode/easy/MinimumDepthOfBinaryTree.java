public class MinimumDepthOfBinaryTree {
    public int fun(TreeNode root){
        if(root==null)
            return 10000;
        if(root.left==null && root.right==null)
            return 1;
        return 1+Math.min(fun(root.left),fun(root.right));
    }
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        return fun(root);
    }
}
