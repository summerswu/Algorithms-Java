class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new LinkedList<>();
       
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
    
        
        Arrays.sort(nums);
        
        for(int ger : nums) System.out.print(ger);
            System.out.println();
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0) break;
            
            int target = 0 - nums[i];
            int[] newArray = Arrays.copyOfRange(nums, i+1, nums.length);
            
            for(int ger : newArray) System.out.print(ger);
            System.out.println();
            
            int[] foundSum = twoSum(newArray, target);
            ArrayList check = new ArrayList<>();
            
            if(foundSum != null){
                
                check.add(nums[i]);
                check.add(foundSum[0]);
                check.add(foundSum[1]);
                
                if(!set.contains(check)) arr.add(check); 
            
            }
        }
       
        return arr;
    }
    
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        Map map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            
            if (map.containsKey(target - nums[i])) {
                result[1] = nums[i];
                result[0] = nums[Integer.valueOf(map.get(target - nums[i]).toString())];
                return result;
            }
            map.put(nums[i], i);
        } 
        return null;
    }
    
}