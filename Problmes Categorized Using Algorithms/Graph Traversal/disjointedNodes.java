class Solution {
    public int makeConnected(int n, int[][] connections) {
        
        if(connections.length<n-1)
            return -1;
        
        int disjointed = 0;//number of disjointed sets = 0
        
        List<Integer>[] map = new List[n];//initiatie the adjacency list for the graph
        
        boolean[] remaining = new boolean[n];
        
        for(int i = 0; i<n; i++){
            remaining[i] = true;
        }
        
        for (int i = 0; i < n; i++) map[i] = new ArrayList<>();
        
        for(int i = 0; i<connections.length; i++){//construct the graph
           map[connections[i][0]].add(connections[i][1]);
           map[connections[i][1]].add(connections[i][0]);   
        }
        
        for(int r = 0; r<remaining.length; r++){
            
            if(remaining[r] == true){
            
                Queue<Integer> q = new LinkedList<Integer>();

                q.add(r);
                remaining[r] = false;

                while(!q.isEmpty()){

                    int curr = q.poll();//bfs, for every node

                    for(int i = 0; i<map[curr].size(); i++){

                        int currNode = map[curr].get(i);

                        if(remaining[currNode] == true){
                            remaining[currNode] = false;
                            q.offer(currNode);
                        }
                        
                    }
                    
                }
                
                disjointed++;//increase the count of disjointed set
                
            } 
            
        }
        //if the nodes you visited are in the visited set
        return disjointed-1;
    }
}