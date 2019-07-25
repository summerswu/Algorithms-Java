class Solution {
    public boolean isIsomorphic(String s, String t) {
        //initiate a hashmap for our purposes  
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        ArrayList<Integer> pos = new ArrayList<Integer>();
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        
        for(int i = 0; i<str1.length; i++){
            if(map1.containsKey(str1[i])){
                str1[i] = (char)map1.get(str1[i]);
                pos.add(i);
            }
            if(map2.containsKey(str2[i])){
                str2[i] = (char)map2.get(str2[i]);
                pos.add(i);
            }
            map1.putIfAbsent(str1[i],(char)i);
            map2.putIfAbsent(str2[i],(char)i);
        }
        
        for(int i = 0; i<pos.size(); i++){
            char test1 = str1[pos.get(i)];
            char test2 = str2[pos.get(i)];
            if (test1 != test2){
                return false;
            }
        };

        return true;
    }
}