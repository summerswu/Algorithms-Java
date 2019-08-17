class Solution {
    public String licenseKeyFormatting(String S, int K) {
        
        if(S.length()<=1) return S.toUpperCase();
        
        Queue<Character> arrOfChar = new LinkedList<Character>();
        
        //iterate across the string
        //skip to the next one if it's a dash\
        int x = 0;
        while(x<S.length()){
            if(S.charAt(x) == '-'){
                x++;
            } else {
                arrOfChar.offer(S.charAt(x));
                x++;
            }
        }
        
        String arr = "";
        
        int first = arrOfChar.size() % K;
        
        for(int i = 0; i<first;i++){
            arr += arrOfChar.poll();
            if(i==first-1) arr+="-";
        }
        
        int size = arrOfChar.size();
        
        for(int i = 0; i < size; i++){
            if(i % K == 0 && i != 0){
                arr += "-";
            }
            arr += arrOfChar.poll();
        }
        
        return arr.toUpperCase();
    }
}