class Solution {
    public boolean wordPattern(String pattern, String str) {
        if (pattern==null || str==null) return false;
        
        char[] patternArr = pattern.toCharArray();
        String[] strArr = str.split(" ",0);
        
        if(patternArr.length != strArr.length) return false;
        
        int numPattern = 0;
        
        int[] numPatternArr = new int[patternArr.length];
        
        HashMap<Character, Integer> firstMap = new HashMap<Character, Integer>();
        HashMap<String, Integer> secondMap = new HashMap<String, Integer>();
        
        
        int i = 0;    
        for (char curr : patternArr){
            if(firstMap.containsKey(curr))
                numPatternArr[i] = firstMap.get(curr);
            else{
                numPattern++;
                numPatternArr[i] = numPattern;
                firstMap.putIfAbsent(curr,numPattern);
            }  
            i++;
        }
        
        numPattern = 0;
        
        i = 0;  
        
        for (String curr : strArr){
            
            if(secondMap.containsKey(curr)) {
                if(numPatternArr[i] != secondMap.get(curr)) return false;
            }
            
            else {
                numPattern++;
                System.out.println(numPattern);
                if(numPatternArr[i] != numPattern) return false;
                secondMap.putIfAbsent(curr,numPattern);
            }
            
            i++;
        }
        
        return true;
    }
}