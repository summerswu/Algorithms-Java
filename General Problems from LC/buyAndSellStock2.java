class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length<2) return 0;
        
        int arr = 0;
        
        int currMin = prices[0];
        
        for(int i = 0; i<prices.length; i++){
            if(prices[i]<currMin) currMin = prices[i];
            else {
                arr = (arr<prices[i]-currMin)? prices[i] - currMin: arr;
            }
        }
        
        return arr;
        
    }
}