class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0)return "";
        
        int y,x;
        int[][] length = new int[s.length()][s.length()];
        int max = 0;
        int[] arr = new int[2];
        
        for(int i = 0; i < s.length(); i++){
            y = 0;
            x = 0 + i;
            
            while(x!=s.length()){
                
                if(x==y)length[y][x]=1;
                
                else if(s.charAt(y) == s.charAt(x)){
                    length[y][x] = length[y+1][x-1]+2;
                } else {
                    length[y][x] = Math.max(length[y+1][x], length[y][x-1]);
                }
        
                if(max < length[y][x]) {max = length[y][x]; arr[0]=y; arr[1]=x;}
                
                y++;
                x++;
            }
        }
        
        System.out.println(Arrays.deepToString(length));
        System.out.println(max);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        return s.substring(arr[0],arr[1]+1); 
    }
}