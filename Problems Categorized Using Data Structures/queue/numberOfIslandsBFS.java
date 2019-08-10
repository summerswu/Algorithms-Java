class Solution {
    public int numIslands(char[][] grid) {
        
        int numberOfIslands = 0;
        
        for (int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
               if(grid[i][j] == '1') numberOfIslands += bfs(grid, i, j); 
            }
        }
        
        return numberOfIslands;
    }
    
    public int bfs(char[][] grid, int x, int y){
        
        grid[x][y]='0';//sink the current portion
        
        int n = grid.length;//height
        int m = grid[0].length;//width
        
        LinkedList<Integer> queue = new LinkedList<Integer>();//new queue of integers
        
        int code = x*m+y;//what does this code do?
        
        queue.offer(code);//add this code to the queue
        
        while(!queue.isEmpty())  
        {  
            code = queue.poll();  
            int i = code/m;  
            int j = code%m;  
            if(i>0 && grid[i-1][j]=='1')    //search upward and mark adjacent '1's as '0'.
            {  
                queue.offer((i-1)*m+j);  
                grid[i-1][j]='0';  
            }  
            if(i<n-1 && grid[i+1][j]=='1')  //down
            {  
                queue.offer((i+1)*m+j);  
                grid[i+1][j]='0';  
            }  
            if(j>0 && grid[i][j-1]=='1')  //left
            {  
                queue.offer(i*m+j-1);  
                grid[i][j-1]='0';  
            }  
            if(j<m-1 && grid[i][j+1]=='1')  //right
            {  
                queue.offer(i*m+j+1);  
                grid[i][j+1]='0';  
            }
        } 
        
        return 1;
    }
}