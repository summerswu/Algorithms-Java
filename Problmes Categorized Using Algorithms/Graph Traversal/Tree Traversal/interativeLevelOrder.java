/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null) return arr;
        
        queue.add(root);
        
        while(queue.size()!=0){
            
            List<Integer> currLayer = new LinkedList<Integer>();
            
            int size = queue.size();
            for(int i = 0; i<size;i++){
                TreeNode curr = queue.poll();
                currLayer.add(curr.val);
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            
            arr.add(currLayer);
        }
        
        return arr;
        
    }
}