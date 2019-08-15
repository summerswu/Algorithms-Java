class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        
        Set<Character> seen = new HashSet<Character>();
        
        int max = 0;
        
        for(int i = 0; i<s.length(); i++){
            
            seen.clear();
            
            int x = i;
            
            while( x < s.length() && !seen.contains(s.charAt(x)) ){
                seen.add(s.charAt(x));
                x++;
            }
            
            if((x-i)>max) max = x-i;
        }
        
        return max;
    }
}