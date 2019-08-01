class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num:nums1) set.add(num);
        HashSet<Integer> ans = new HashSet<Integer>();
        
        for(int i = 0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        int[] a = new int[ans.size()];
        int i = 0;
        for (Integer val : ans){ 
           a[i] = val;
           i++;
        }                       
        return a;
    }
}