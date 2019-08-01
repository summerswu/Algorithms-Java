class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i : nums1){
            if (map.containsKey(i))map.put(i,map.get(i)+1);
            else map.putIfAbsent(i,1);
        }
        
        List<Integer> ans = new ArrayList<Integer>();
        
        for (int i :nums2){
            if (map.containsKey(i)){
                ans.add(i);
                map.put(i, map.get(i)-1);
                if(map.get(i)==0){
                    map.remove(i);
                }
            }
        }
        
        int[] ansA = new int[ans.size()];
        int x = 0;
        for (int i : ans){
            ansA[x] = i;
            x++;
        }
        return ansA;
    }
}