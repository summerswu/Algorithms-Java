class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for(char s : S.toCharArray()){
            if(stack.size() >= 2){
               char last = stack.pop();
               char slast = stack.pop();
                if(last == s && slast == s)
                    continue;
                else{
                    stack.push(slast);
                    stack.push(last);
                }
            } 
            stack.push(s);
        }
            
        StringBuilder sb = new StringBuilder();
    
        for(char s : stack) sb.append(s);
    
        return sb.toString();
    }
}