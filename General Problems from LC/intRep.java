class Solution {
    public int integerReplacement(int n) {
        return integerRep((long)n);
    }
    
    public int integerRep(long n){
        int ans = 0;
        
        if(n <= 1) ans = 0;
        
        else if(n%2 == 0){
            ans = 1 + integerRep(n/2);
        } else {
            ans = Math.min(1 + integerRep(n-1), 1 + integerRep(n+1));
        }
        return ans;
    }
}