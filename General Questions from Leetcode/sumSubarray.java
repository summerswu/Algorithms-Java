class Solution {
    public int maxSubArray(int[] nums) {
        int maxAns = nums[0]; int maxRunning =  nums[0];
            for(int i = 1; i < nums.length; i++){
                maxRunning = Math.max(maxRunning + nums[i], nums[i]);
                maxAns = Math.max(maxRunning, maxAns);
            }
        
        return maxAns;
    }
}