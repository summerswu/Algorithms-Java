class Solution {
    public int[] plusOne(int[] digits) {
         
        int changeNum=0;
        int length = digits.length-1;
        for(int i=length; i >= 0; i --)
         {
             if(digits[i]!=9){
                 changeNum=i;
                 break;
             }         
         } 
         if(changeNum==0 && digits[0] == 9){
            
            int[] extra = new int[digits.length+1]; 
            extra[0]=1;
            for(int i=1; i<extra.length; i++)
            {
                extra[i] = 0;
            }
            
            return extra;
            
        }
         
        else{        
            digits[changeNum] = digits[changeNum]+1;
            for(int i=changeNum+1; i<digits.length; i++)
            {
                digits[i] = 0;
            }
        }
        
        
        return digits;
        
    }
}