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
    public int widthOfBinaryTree(TreeNode root) {
        //initiate the queue for level traversal
        Queue<TreeNode> queue = new LinkedList<>();//add the root node to the queue
        
        if(root == null) return 0;//if root == null return 0
        
        int max = 0;//integer max width = 0
        
        queue.offer(root);
        
        while(!queue.isEmpty()){//while queue is not empty
        
            int size = queue.size();//int size = queue.size
            
            ArrayList<Integer> valuesAt = new ArrayList<Integer>();
            
            for(int i = 0; i<size; i++){
                TreeNode curr = queue.poll();
                if(curr.val != Integer.MIN_VALUE){
                    valuesAt.add(i);
                }
                TreeNode space = new TreeNode(Integer.MIN_VALUE);
                if(curr.left == null) curr.left = space;
                if(curr.right == null) curr.right = space;
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
            if(valuesAt.size()<1) break;
            max = Math.max(max, 1+valuesAt.get(valuesAt.size()-1)-valuesAt.get(0));
        }
        
        return max;
        //iterate through the queue that many times as queue size
        //if child node is null
        //add a child node there with int min
        //count the first apperance of a node that's not integer min
        //count the last apperance of a node that's noit integer min
    }
}