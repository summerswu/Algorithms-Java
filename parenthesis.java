class Solution {
    public boolean isValid(String s) {
        if(s.length()==0 || s.length()==1 || s.length()%2 ==1)return false;
        Stack<Character> chars = new Stack<>();
        for (char c : s.toCharArray()) {
            chars.push(c);
            System.out.print(c);
        }
        return checkLast(chars);
        
    }
    
    public boolean checkLast(Stack chars){
        if(chars.isEmpty())return true;
        char first = (char)chars.peek();
        chars.pop();
        if (first == ')' && (char)chars.peek()=='('){
            chars.pop();
        }
        else if (first == '}' && (char)chars.peek()=='{'){
            chars.pop();
        }
        else if (first == ']' && (char)chars.peek()=='['){
            chars.pop();
        }
        else return false;
        checkLast(chars);
        return true;
    }
}