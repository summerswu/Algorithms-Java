class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode first = root;
        TreeNode pre = null;
        
        while(root != null){
           pre = root;
           if(root.val<val){
               root = root.right;
           }
           else if(root.val > val){
               root = root.left;
           }
        }
        TreeNode node = new TreeNode(val);
        if(pre.val < val) pre.right = node;
        else pre.left = node;
        return first;
        
    }
}