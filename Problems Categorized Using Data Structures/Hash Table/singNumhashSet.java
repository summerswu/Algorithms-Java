class Solution {
    public int singleNumber(int[] nums) {
         Set<Integer> mySet = new HashSet<>();
        
            for(int key : nums)
            {
                if(mySet.contains(key))
                        mySet.remove(key);
                else
                    mySet.add(key);
            }
        
          return mySet.toArray(new Integer [1])[0];
    }
}