class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int jamCount =0;
        char[] jewel = J.toCharArray();
        char[] stone = S.toCharArray();
       
        for (int i=0; i< jewel.length; i++) 
            { 
               for(int x = 0; x < stone.length; x++){
                  if(jewel[i] == stone[x]){
                       jamCount ++;
                  }
               }
            }
        
        return jamCount;
    }
}