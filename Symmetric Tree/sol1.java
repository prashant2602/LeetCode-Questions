class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        return isPossible(root.left,root.right);
    }
    private boolean isPossible(TreeNode node1,TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
        }
        return node1.val==node2.val && isPossible(node1.left,node2.right) && isPossible(node1.right,node2.left);
    }
}
