public class BinaryTreePreorderTraversal {
    ArrayList<Integer> result=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            result.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        return result;

    }
}
