class Solution {
    
    private int ans;
    
    public int maxDepth(TreeNode root) {
        
        maxDepthHelper(root,0);
        return ans;
        
    }
    
    public void maxDepthHelper(TreeNode root, int depth){
        
        if(root == null)
            return;
        else 
            ans = Math.max(depth, ans);
        maxDepthHelper(root.left, depth+1);
        maxDepthHelper(root.right, depth+1);
        
    }
}