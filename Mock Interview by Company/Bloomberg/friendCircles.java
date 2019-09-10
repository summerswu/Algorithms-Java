class Solution {
    public int findCircleNum(int[][] M) {
        int count = 0;
        for(int i = 0; i<M.length; i++){
            for(int j = 0; j<M.length; j++){
                if(M[i][j] == 1){
                    count++;
                    M[i][j] = 0;
                    M[j][i] = 0;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(j);
                    while(!queue.isEmpty()){
                        int currNode = queue.poll();
                        for(int x=0; x<M[currNode].length; x++){
                            if(M[currNode][x]==1){
                                queue.offer(x);
                                M[currNode][x] = 0;
                                M[x][currNode] = 0;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}