class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        if(root == null) return true;
        queue.add(root);
        
        int layerCounter = 1;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            if(size!=layerCounter) return false;
            
            Stack<Integer> stack = new Stack<>();
            int sideCounter = 0;
            
            for(int i = 0; i<size; i++){
                TreeNode curr = queue.poll();
                if(sideCounter < layerCounter/2)stack.push(curr.val);
                else{
                    if(!stack.isEmpty() && stack.pop()!=curr.val)
                        return false;
                }
                sideCounter++;
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            
            layerCounter*=2;
            System.out.println(stack);
        }
        
        return true;
    }
}