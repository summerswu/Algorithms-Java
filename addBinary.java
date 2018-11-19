class Solution {
    public String addBinary(String a, String b) { 
        
        if(a.length() > b.length()) {
            char[] larger = a.toCharArray();
            char[] smaller = b.toCharArray();
        }
        else {
            char[] larger = b.toCharArray();
            char[] smaller = a.toCharArray();
        }
        //sorting out which string is larger and converting them to prevent out of bound
        int counter = 0;
        int length = smaller.length-1;
        for(int i = length; i>=0; i --){
            
            if(larger[i]==1 && smaller[i]==1 && counter ==0){
                larger[i]=0;
                counter = 1;
            }
            
            if(larger[i]==1 && smaller[i]==1 && counter !=0){
                larger[i]=1;
                counter = 1;
            }
            
            if(((larger[i]=1 && smaller[i]=0) || (larger[i]=0 && smaller[i]=1) ) && counter ==0){
                larger[i]=1;
                counter=0;
            }
            
            if(((larger[i]=1 && smaller[i]=0) || (larger[i]=0 && smaller[i]=1) ) && counter !=0){
                larger[i]=0;
                counter=1;
            }
            
            if(larger[i]=0 && smaller[i]=0 && counter==0){
                larger[i]=0;
                counter =0;
            }  
            
            if(larger[i]=0 && smaller[i]=0 && counter!=0){
                larger[i]=0;
                counter =0;
            } 
            
        
        }
   return larger; 
    }
    
    
}