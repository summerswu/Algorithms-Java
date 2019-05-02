class Solution {
    public int rob(int[] nums) {
        int sumOne=0,sumTwo=0, max=0;

        
        for(int i = 0; i<nums.length; i++){
            if((i%2) == 0) sumOne += nums[i];
            else sumTwo += nums[i];
        }
        System.out.println("test");
        
        max = Math.max(sumOne, sumTwo);
        return max;
    }
}