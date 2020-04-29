class Solution {
    public int makeConnected(int n, int[][] connections) {
        
        if(connections.length<n-1)
            return -1;
        
        int disjointed = 0;//number of disjointed sets = 0
        
        List<Integer>[] map = new List[n];//initiatie the adjacency list for the graph
        HashSet<Integer> remaining = new HashSet<Integer>();//initiate the disjointed hashset
        
        for(int i = 0; i<n; i++){
            remaining.add(i); 
        }
        
        for (int i = 0; i < n; i++) map[i] = new ArrayList<>();
        
        for(int i = 0; i<connections.length; i++){//construct the graph
           map[connections[i][0]].add(connections[i][1]);
           map[connections[i][1]].add(connections[i][0]);
        }
        
        while(remaining.size()!=0){
            
            HashSet<Integer> visited = new HashSet<Integer>();//inititiate the visited hashset
            Queue<Integer> q = new LinkedList<Integer>();
      
            Iterator<Integer> iter = remaining.iterator();
            int next = iter.next();
            
            q.add(next);
            visited.add(next);
            
            while(!q.isEmpty()){
                
                int curr = q.poll();//bfs, for every node
                
                for(int i = 0; i<map[curr].size(); i++){
                    
                    int currNode = map[curr].get(i);
                    
                    if(!visited.contains(currNode)){
                        visited.add(currNode);
                        q.offer(currNode);
                    }
                    
                }      
            }
            
            for(int element : visited){
                remaining.remove(element);
            }
            
            disjointed++;//increase the count of disjointed set 
            
        }
        //if the nodes you visited are in the visited set
        return disjointed-1;
    }
}