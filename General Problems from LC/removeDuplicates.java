class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> unique = new HashSet<Integer>();
        for(int val : nums){
            unique.add(val);
        }
        int[] uniqueVal = new int[unique.size()];
        int i = 0;
        for(int val : unique){
            nums[i] = val;
            i++;
            System.out.println(val);
        }
        Arrays.sort(nums, 0, unique.size());
        return unique.size();
    }
}