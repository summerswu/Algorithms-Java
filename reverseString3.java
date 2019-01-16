class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\ +");
        for(int i = 0;i < words.length; i++){
            words[i] = reverse(words[i]);
            System.out.println(words[i]);
        }
       String arr = String.join(" ", words);
        return arr;
    }
    
    public String reverse(String s) {
        if(s.equals("")){
            return s;
        }
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            char first = arr[i];
            char second = arr[j];
            arr[j] = first;
            arr[i] = second;
            i++;
            j--;
        }
        
        String answer = new String(arr);
        return answer;
       
    }
}