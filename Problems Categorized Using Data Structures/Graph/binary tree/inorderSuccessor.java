class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        
       if (root == null) return null;
       Stack<TreeNode> stack = new Stack<>();
       TreeNode pre = null;
       while (root != null || !stack.isEmpty()) {
          while (root != null) {
             stack.push(root);
             root = root.left;
          }
          root = stack.pop();
          if(pre != null && pre == p) return root;
          pre = root;
          root = root.right;
       }
       return null;
        
    }
}