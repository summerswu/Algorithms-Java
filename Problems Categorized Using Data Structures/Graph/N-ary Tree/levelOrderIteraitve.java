class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> arr = new LinkedList<>();
        Queue<Node> queue = new LinkedList();
        
        if(root == null) return arr;
            
        queue.offer(root);
        
        while(!queue.isEmpty()){
            
            List<Integer> currLevel = new LinkedList<>();
            int size = queue.size();
            
            for(int i = 0; i<size; i++){
                Node curr = queue.poll();
                currLevel.add(curr.val);
                if(curr.children != null && curr.children.size()>0){
                    for(Node child : curr.children){
                        queue.offer(child);
                    }
                }
            }
            arr.add(currLevel);
            
        }
    
        return arr;
    }
}