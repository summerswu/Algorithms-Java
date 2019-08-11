class Solution {
    
    int inf = 2147483647;
    
    public void wallsAndGates(int[][] rooms) {
        for(int i = 0 ; i<rooms.length; i++){
            for(int j = 0; j < rooms[i].length; j++){
                if(rooms[i][j] == inf) rooms[i][j] = shortestPath(rooms,i,j);
            }
        }
    }
    
    public int shortestPath(int[][] rooms, int x, int y){
        int sDistance = inf;//this is the distance while we need to find, which one is shorter?
        int currDistance = 0;
        
        int n = rooms.length;//height
        int m = rooms[0].length;//width
        
        Queue<Integer> queue = new LinkedList<Integer>();
        Set<Integer> visited = new HashSet<Integer>();
        
        int code = x*m + y;
        
        queue.offer(code);
        visited.add(code);
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            for(int z = 0; z<size; z++){
                
                code = queue.poll();  
                int i = code/m;  
                int j = code%m; 
                
                if(rooms[i][j]==0 && !visited.contains(code)) sDistance = Math.min(sDistance, currDistance);
                
                int newCode = 0;

                if(i > 0 && rooms[i-1][j] != -1){
                    newCode = (i-1)*m + j;
                    if(!visited.contains(newCode)){
                        queue.add(newCode);
                        visited.add(code);
                    }
                }//up
                    
                if(i < n-1 && rooms[i+1][j] != -1){
                    newCode = (i+1)*m + j;
                    if(!visited.contains(newCode)){
                        queue.add(newCode);
                        visited.add(code);
                    }
                }//down
                    
                if(j > 0 && rooms[i][j-1] != -1){
                    newCode = (i)*m + j - 1;
                    if(!visited.contains(newCode)){
                        queue.add(newCode);
                        visited.add(code);
                    }
                }//left
                
                if(j < m-1 && rooms[i][j+1] != -1){
                    newCode = (i)*m + j + 1 ;
                    if(!visited.contains(newCode)){
                        queue.add(newCode);
                        visited.add(code);
                    }
                }//right  
                
            }
            
            currDistance++;
        }
        return sDistance;
    }
}