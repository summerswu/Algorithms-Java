class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 ==1)return false;
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            chars.add(c);
            System.out.print(c);
        }
        return checkLast(chars);
        
    }
    
    public boolean checkLast(ArrayList chars){
        if(chars.isEmpty())return true;
        if(chars.size()==1)return false;
        
        char first = (char)chars.get(chars.size()-1);
        chars.remove(chars.size()-1);
       
        if (first == ')'){
            for(int i = chars.size()-2; i<=0; i--){
                if((char)chars.get(i)=='(') {chars.remove(i);break;}
                else if(i==0)return false;
            }
        }
        
        else if (first == '}'){
            for(int i = chars.size()-2; i<=0; i--){
                if((char)chars.get(i)=='{') {chars.remove(i); break;}
                else if(i==0)return false;
            }
        }
        
        else if (first == ']'){
            for(int i = chars.size()-2; i<=0; i--){
                if((char)chars.get(i)=='[') {chars.remove(i); break;}
                else if(i==0)return false;
            }
        }
            
        else return false;
        checkLast(chars);
        return true;
    }
}