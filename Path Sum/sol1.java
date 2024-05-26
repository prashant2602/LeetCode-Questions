class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.right==null && root.left==null){
            return targetSum==root.val;
        }
        boolean rightSum=hasPathSum(root.right,targetSum-root.val);
        boolean leftSum=hasPathSum(root.left,targetSum-root.val);
        return leftSum || rightSum;
        
    }
}
