class Solution {
    public int dominantIndex(int[] nums) {
        
        int largest=0;
        int largestIndex=0;
        
        for(int i=0; i<nums.length; i++){
           if(nums[i]>largest){
               largest = nums[i];
               largestIndex = i;
            }    
        }
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] ==0 ){
                continue;
            }
            if(i==largestIndex){
                continue;    
            }
            if((largest/nums[i])<2) {
                return -1;
            }
        }
        
        return largestIndex;
    }
}