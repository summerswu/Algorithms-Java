class Solution {
    public int strStr(String haystack, String needle) {
        char[] hay = haystack.toCharArray(); //converting both String to Arrays
        char[] need = needle.toCharArray();
        System.out.println(need.length);
        if(need.length>hay.length){return -1;}
        if(need.length==0 && hay.length >=0){
            
            return 0;
        }
        if(need.length==0 || hay.length ==0){
            return -1;
        }
        if(need.length==1&&hay.length==1){  
            if(hay[0]==need[0]){
                   return 0; 
            }
        }
        if(need.length==hay.length){
            for(int j = 0; j<hay.length; j++){
                if(hay[j]!=need[j]){break;}
                if((j+1)==need.length){
                        return 0;
                    } 
            }
        }
        for(int i = 0; i<hay.length; i++){
            if(need.length>hay.length-i-1){
                return -1;
            }
            if(hay[i]==need[0]){  
                for(int x = 0; x < need.length; x++)
                {
                    if(hay[i+x]!=need[x]){
                     break;}
                    System.out.println(x);
                    if((x+1)==need.length){
                        return i;
                    }     
                } 
            }
        
        }    
        return -1;
    }
}