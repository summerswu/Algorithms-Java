class Solution {
    public int singleNumber(int[] nums) {
         Arrays.sort(nums);
        if(nums.length == 1){return nums[0];};
        if(nums[0] != nums[1]){return nums[0];}
        if(nums[nums.length-1] != nums[nums.length-2]){return nums[nums.length-1];};
        
        for (int i = 3; i < nums.length-3; i++){
            if (nums[i+1] == nums[i+2] && nums[i-1] == nums[i-2] && nums[i+2]==nums[i+3] && nums[i-2]==nums[i-3]){
                return nums[i];
            }
        }
        return 0;
    }
}