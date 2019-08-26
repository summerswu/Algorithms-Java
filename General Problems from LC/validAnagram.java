class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())return false;

        HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();
        
        for(int i = 0; i< s.length(); i++){
            if(occurences.containsKey(s.charAt(i))) 
                occurences.put(s.charAt(i), occurences.get(s.charAt(i))+1);
            occurences.putIfAbsent(s.charAt(i),1);
        }
        
        for(int i = 0; i<t.length(); i++){
            if(occurences.containsKey(t.charAt(i))==false) return false;
            if(occurences.get(t.charAt(i)) == 0) return false;
            occurences.put(t.charAt(i), occurences.get(t.charAt(i))-1);
        }
        
        return true;
        
    }
}
