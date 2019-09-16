class Solution {
    public int maximumProduct(int[] nums) {
        
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        if(nums.length < 4) return nums[0]*nums[1]*nums[2];
        
        for(int i = 0; i<nums.length; i++){
            
            if(nums[i] < min){
                min2 = min;
                min = nums[i];
            } else if(nums[i] < min2){
                min2 = nums[i];
            }
            
            if(nums[i] > one){
                three = two;
                two = one;
                one = nums[i];
            } else if (nums[i] > two) {
                three = two;
                two = nums[i];
            } else if (nums[i] > three) three = nums[i];
        } 
        
        return Math.max(one*two*three, one*min*min2);
        
    }
}