class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> arr = new LinkedList<Integer>();
        Stack<Node> stack = new Stack();
        
        if(root==null) return arr;
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            Node curr = stack.pop();
            arr.add(curr.val);
            
            if(curr.children == null || curr.children.size() == 0)continue;
            for(int i = curr.children.size()-1; i >-1; i--){
                stack.push(curr.children.get(i));
            }
        }
        return arr;
    }
}