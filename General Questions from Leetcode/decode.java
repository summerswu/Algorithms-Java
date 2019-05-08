class Solution {
    public String decodeString(String s) {
        //take the string as stack, ignore the brackets, 
        //when encounter the first number, traverse backwards and repeat the appended stack 
        //
        String ans = "";
        if(s.length() == 0)return ans;
        char[] input = s.toCharArray();
        
        for(int i = input.length - 1; i>=0; i--){
            if(input[i]=='['){
                int x = i+1;//x is the start of the letters
                System.out.println("This is the number! " + input[i-1]);//i -1 recognize the number infront of the bracket
                while(input[x]!=']'){
                    System.out.print(input[x]);
                    System.out.println();
                    x++;
                }//this finds everything that is inbetween the brackets
                
            }
            
        }
        
        return ans;
    }
}