class Solution {
    public int pivotIndex(int[] nums) {
        
        int forwards=0; 
        int backwards=0;
        int sum =0;
        
        for (int i = 0; i<nums.length; i++){
            sum += nums[i];
            }
        
        for (int i = 0; i<nums.length; i++){
    
            backwards = sum - nums[i];
            sum = sum - nums[i];
            if(forwards == backwards){
                return i;
                }
            forwards +=nums[i];
        }
        
        return -1;
    }
}