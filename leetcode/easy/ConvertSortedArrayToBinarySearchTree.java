public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBT(nums,0,nums.length-1);
    }

    public TreeNode createBT(int arr[],int st,int end){
        if(st>end)
            return null;

        int mid=(st+end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = createBT(arr,st,mid-1);
        root.right = createBT(arr,mid+1,end);
        return root;

    }
}
