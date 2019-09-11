/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    
    TreeNode curr;
    Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        this.curr = root;
    }
    
    /** @return the next smallest number */
    public int next() {
        int ans = Integer.MIN_VALUE;
        
        if(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            
            curr = stack.pop();
            ans = curr.val;
            curr = curr.right;
        }
        
        return ans;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(curr == null && stack.isEmpty()) return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */