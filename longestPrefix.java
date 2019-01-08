class Solution {
    public String longestCommonPrefix(String[] strs) {
        //char array keeping 
        String blank = "";
        if(strs.length == 0) return blank;
        if(strs.length == 1) return strs[0];
        
        int loop = strs[0].length(); 
        
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < loop) loop=strs[i].length();
        }

        if(loop ==0) return blank;
        System.out.println("loop in "+ loop);
        if(loop==1){
            
            for(int i = 0; i < strs.length; i++)
            {
                if(!strs[0].substring(0, 1).equals(strs[i].substring(0,1))){
                     System.out.println("blank!");
                    return blank;
                } 
            }
            return strs[0].substring(0, 1);
        }
        
        System.out.println(loop);
        for(int i = 0; i < strs.length; i++){
            while(!strs[0].substring(0, loop-1).equals(strs[i].substring(0, loop-1))){
                if(loop-1>-1){
                    loop=loop-1;
                }
                
            System.out.println("loop in "+ loop);
           } 
        }
       
        return strs[0].substring(0, loop-1);
    }

}