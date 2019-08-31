class Solution {
  public static void main(String[] args) {
    
  } 
  
  public static List<Integer> findLeftMostNode(TreeNode root){
    List<Integer> arr = new ArrayList<Integer>(); 
    Queue<TreeNode> queue = new LinkedLIst<TreeNode>();
    
    queue.add(root);
    
    while(!queue.isEmpty()){
      int size = queue.size();
      
      for(int i = 0 ; i<size; i++){
        TreeNode curr = queue.poll();
        if(i == 0) arr.add(curr.val);
        if(curr.left!=null) queue.offer(curr.left);
        if(curr.right!=null) queue.offer(curr.right);
      }
      
    }
    
    return arr;
    
  }
}
