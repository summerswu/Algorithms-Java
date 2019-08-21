class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> arr = new LinkedList();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-2; i++){
            
            if( i == 0 || nums[i] > nums[i-1]){
                int lookingFor = -(nums[i]);

                int start = i + 1;
                int end = nums.length-1;
                
                while(start < end){
                    
                    if( (nums[start] + nums[end]) == lookingFor){
                        arr.add(Arrays.asList(nums[i],nums[start],nums[end]));
                        while(nums[start+1]==nums[start])start++;
                        start++;
                    }
                    
                    else if( (nums[start] + nums[end]) > lookingFor)
                    {
                        while(nums[end-1]==nums[end])end--;
                        end--;
                    }
                    
                    else if( (nums[start] + nums[end]) < lookingFor)
                    {
                        while(nums[start+1]==nums[start])start++;
                        start++;
                    }
                    
                }
            }
            
        }
        
        return arr;
    }  
}