public class BinaryTreeInorderTraversal {
    private List<Integer> res=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
     travese(root);
     return res;
    }
    public void travese(TreeNode root){
        if(root==null)
            return;
        travese(root.left);
        res.add(root.val);
        travese(root.right);
    }
}
