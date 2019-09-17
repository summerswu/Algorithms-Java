class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        
        ans[0] = 1;
        
        for(int i = 1 ; i < nums.length ; i++)
            ans[i] = nums[i-1]*ans[i-1];
        
        int tracker = 1;
        
        for(int i = ans.length - 1 ; i>-1 ; i--){
            ans[i] = tracker*ans[i];
            tracker *= nums[i];
        }
        
        return ans;
    }
}