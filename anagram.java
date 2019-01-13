class Solution {
    public boolean isAnagram(String s, String t) 
    
    {   
        if(s.length() ==0)
        {
            return true;
        }
        int sLength = s.length();
        int tLength = t.length();
        
        if(sLength!=tLength)
        {
            return false;
        }
        
        
        ArrayList<Character> tArray = new ArrayList<Character>();//Arraylist for String S
        {
            for (int i = 0; i < t.length(); i++)
            {
                tArray.add(t.charAt(i));
            }
        }
        
       for (int i=0; i<s.length(); i++)
       {
            char currentChar = s.charAt(i);
            for (int x = 0; x<tArray.size(); x++)
            {
               if( currentChar == tArray.get(x))
               {
                   tArray.remove(x);
               }
                
                break;
            }
           
        }
        
        if(tArray.size() == 0)
           {
               return true; 
           }
           
           return false;
              
    }
}