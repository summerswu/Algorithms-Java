class Solution {
    
    private int ans;
    
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
        int leftDepth = maxDepth(root.right);
        int rightDepth = maxDepth(root.left);
        
        return Math.max(leftDepth,rightDepth) + 1;
    }
    
}