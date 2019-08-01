class Solution {
    public int removeElement(int[] nums, int val) {
         int k = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] != val) {
                    System.out.println(nums[k]);
                    System.out.println(k);
                    nums[k] = nums[i];
                    k++;
                    System.out.println(k);
                }
            }
        return k;
    }
}