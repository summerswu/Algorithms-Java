class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length<2) return 0;
        
        int arr = 0;
        
        for(int i = 0; i<prices.length; i++){
            for(int j = i; j<prices.length; j++){
                int diff = prices[j]-prices[i];
                arr = (arr<diff)? diff: arr; 
            }
        }
        
        return arr;
        
    }
}