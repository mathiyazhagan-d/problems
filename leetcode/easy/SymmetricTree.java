public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return false;
        return ischeck(root.left,root.right);
    }
    public boolean ischeck(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        return root1.val == root2.val && ischeck(root1.left , root2.right) && ischeck(root1.right , root2.left);
    }
}
