class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i = 0;
        int k = nums.length - 1;
        
        while(nums[i]+nums[k]!=target){
            if(nums[i]+nums[k] > target) k--;
            if(nums[i]+nums[k] < target) i++;
        }
            
        int ans[] = {i,k};
        
        return ans;
        
    }
}