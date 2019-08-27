class Solution {
    public int findPeakElement(int[] nums) {
        int beginning = 0;
        int end = nums.length-1;
        
        while(beginning < end-1){
            System.out.println(beginning);
            System.out.println(end);
            int mid = (beginning + end)/2;
            
            if(mid <= nums.length && nums[mid+1] > nums[mid]){
                beginning = mid;
                continue;
            }
            if(mid-1 >= 0 && nums[mid-1] > nums[mid]){
                end = mid;
                continue;
            }
    
            return mid;
        }
        
        if(beginning == (end-1)){
            
            if(nums[beginning] > nums[end]){
                return beginning;
            } 
            return end;
        }
        
        return beginning;
    }
}