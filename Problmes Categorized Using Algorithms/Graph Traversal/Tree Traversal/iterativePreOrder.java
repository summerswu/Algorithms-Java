class Solution {
    
   public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> pre = new LinkedList<Integer>();
	    Stack<TreeNode> stack = new Stack<TreeNode>();
       
        if(root == null) {
          return pre;
        }
        
        stack.push(root);
       
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            pre.add(curr.val);
            if(curr.right!=null)stack.push(curr.right);
            if(curr.left!=null)stack.push(curr.left);
        }
       
        return pre;
       
	}
}