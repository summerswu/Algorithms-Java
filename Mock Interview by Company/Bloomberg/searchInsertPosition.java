class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        while(start+1<end){
            
            int mid = (start+end)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target){
                start = mid;
            }
            if(nums[mid] > target){
                end = mid;
            }
        }
        
        if (nums[end] < target) {
            return end + 1;
        } else if (nums[start] >= target) {
            return start;
        } else {
            return end;
        }       
    }
}