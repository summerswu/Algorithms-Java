class Solution {
    public int trap(int[] height) {
        
        int sum = 0;
        
        for(int i = 0; i<height.length; i++){
            int water = 0;
            
            int maxLeft = 0;
            int maxRight= 0;
            
            int leftPointer = i;
            int rightPointer = i;
            
            while(leftPointer >= 0){
                if(height[leftPointer]>maxLeft) maxLeft = height[leftPointer];
                leftPointer--;
            }
            
            while(rightPointer <= height.length-1){
                if(height[rightPointer]>maxRight) maxRight = height[rightPointer];
                rightPointer++;
            }
            
            water = Math.max(Math.min(maxLeft, maxRight)-height[i],0);
            sum += water;
        }
        
        return sum;
        
    }
}