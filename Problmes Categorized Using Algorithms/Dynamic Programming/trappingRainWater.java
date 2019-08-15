class Solution {
    public int trap(int[] height) {
        
        if(height.length<3) return 0;
        
        int sum = 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        maxLeft[0] = 0;
        maxRight[height.length-1] = 0;
        
        int maxCurr = 0;
        
        for(int i = 1; i<height.length; i++){
            if(height[i-1]>maxCurr) maxCurr = height[i-1];
            maxLeft[i] = maxCurr;
        }
        
        maxCurr = 0;
        
        for(int i = height.length-2; i > 0-1; i--){
            if(height[i+1]>maxCurr) maxCurr = height[i+1];
            maxRight[i] = maxCurr;
        }
        
        for(int i = 0; i<height.length; i++){
            sum += Math.max(Math.min(maxRight[i],maxLeft[i])-height[i],0);
        }
        return sum;
    }
}