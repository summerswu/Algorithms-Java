class Solution {
    
    public int fib(int N) {
        
        if(N<2) return N;
        
        int[] memo = new int[N];
        for(int i = 0; i<N; i++){
            memo[i] = Integer.MAX_VALUE;
        }
        return fibMemo(N, memo);
        
    }
    
    public int fibMemo(int N, int[] memo){
        
        if(N<2){
            memo[N] = N;
            return N;
        } 
        
        int first = 0;
        int second = 0;
        
        if(memo[N-1] != Integer.MAX_VALUE)
            first =  memo[N-1];
        else first = fibMemo(N-1, memo);
        if(memo[N-2] != Integer.MAX_VALUE)
            second =  memo[N-2];
        else second = fibMemo(N-2, memo);
        
        return first+second;
        
    }
}