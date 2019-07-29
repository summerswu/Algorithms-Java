class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1,-1};
        
        if (nums == null || nums.length == 0)
            return ans;
        
        int start = 0;
        int end = nums.length-1;
        
        while (start + 1< end){
            int mid = start + (end - start)/2;
            
            if(nums[mid] == target) {
                int startS = mid;
                int endS = mid;
                while(nums[startS-1] == target && startS!=0){
                    startS--;
                }
                while(nums[endS+1] == target && endS < nums.length-1){
                    endS++;
                }
    
                ans[0] = startS;
                ans[1] = endS+1;
                return ans;
                
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if(nums[start] == target);
        if(nums[start] == target);
        
        return ans; 
    }
}