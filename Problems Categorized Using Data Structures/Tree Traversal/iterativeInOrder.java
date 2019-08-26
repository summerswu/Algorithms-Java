class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> pre = new LinkedList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
    
        TreeNode end = root;
        
        if(end == null) return pre;
        
        while(true){
            
            if(end != null){
                stack.push(end);
                end = end.left;
            }
            
            else {
                if(stack.isEmpty()) break;
                end = stack.pop();
                pre.add(end.val);
                end = end.right;
            }
            
        }
        
		return pre;
    }
}