class Solution {
    
    public int climbStairs(int n) {
        return climbStairs(n, 0);
    }
    
    public int climbStairs(int n, int sum){
        if(sum > n)
            return 0;
        if(n==sum)
            return 1;
        return climbStairs(n, sum + 1) + climbStairs(n, sum + 2);
    }
}