class Solution {
    public int lengthOfLIS(int[] nums) {
        //longest increasing subsequence, not longest continuos subsequence
        if(nums.length==0) return 0;
        int max = 0;
        
        HashMap<Integer, Integer> dp = new HashMap<Integer,Integer>();
        
        for(int i = 0; i<nums.length; i++){
            
            int maxCurr = 1;
                
            for(Map.Entry element: dp.entrySet()){
                int key = (int)element.getKey();
                int val = (int)element.getValue();
                if(key<nums[i])
                    maxCurr = Math.max(maxCurr, val+1);
            }
            dp.put(nums[i], maxCurr);
            max = Math.max(maxCurr, max);
        }
        
        return max;
    }
}