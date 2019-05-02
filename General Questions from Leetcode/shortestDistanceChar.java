class Solution {
    public int[] shortestToChar(String S, char C) {
        
        char[] string = S.toCharArray();
        int x = 0;
        int j = 0;//three pointer to extend both ways to get number 
        int min = 0;
        int [] arr = new int[S.length()];
    
        
        if(S == null || S.length() == 0)return arr;
        
        for(int i = 0; i< string.length; i++){
            while(string[i-x] != C && (i-x) != 0){
                x++;  
            }  
            while(string[i+j] != C && (i+j) != string.length -1){
                j++;
            }
            if(string[i-x] != C){
                arr[i] = j;
            }
            else if(string[i+j] != C){
                arr[i] = x;
            }
            else if(string[i-x] == C || string[i+j] == C){
                min = Math.min(x,j);
                arr[i] = min;
            }
        
            x = 0;
            j = 0;
        }
        
        return arr;
    }
}