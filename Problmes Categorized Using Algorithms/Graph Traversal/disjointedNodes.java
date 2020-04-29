
public class disjointedNodes {
    public int makeConnected(int n, int[][] connections) {
        
        if(connections.length<n-1)
            return -1;
        
        int disjointed = 0;//number of disjointed sets = 0
        
        int[][] map = new int[n][n];//initiatie the adjacency list for the graph
        HashSet<Integer> remaining = new HashSet<Integer>();//initiate the disjointed hashset
        
        for(int i = 0; i<n; i++){
            remaining.add(i); 
        }
        
        for(int i = 0; i<connections.length; i++){//construct the graph
            map[connections[i][0]][connections[i][1]] = 1;
            map[connections[i][1]][connections[i][0]] = 1;  
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
                for(int i = 0; i<map[curr].length; i++){
                    if(map[curr][i] == 1 && (!visited.contains(i))){
                        map[curr][i] = 0;
                        map[i][curr] = 0;
                        q.add(i);
                        visited.add(i);
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