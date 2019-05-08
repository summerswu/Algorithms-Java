class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length())
            return false;   
        
        char[] first = A.toCharArray();
        char[] second = B.toCharArray();
        
        int[] one = new int[A.length()];
        int[] two = new int[A.length()];
        
        for(int i = 0; i<A.length(); i++){
            one[i] =  (int)first[i];
            two[i] = (int)second[i];
        }
        
        Arrays.sort(one);
        Arrays.sort(two);
        
        for(int i = 0; i<A.length(); i++){
            if(one[i]!=two[i])
                return false;
        }
        
        return true;
    }
}