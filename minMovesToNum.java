class Solution {
    public int minMoves2(int[] nums) {
        int middle = (int)nums.length/2;
        Arrays.sort(nums);
        int arr = 0;
        
        for(int i = 0; i<nums.length; i++){
          if(i<middle){
             arr += nums[middle]-nums[i];
          }
          else{
             arr += nums[i]-nums[middle];
          }
        }
        return arr;
        
    }
}