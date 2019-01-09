class Solution {
    public String reverseString(String s) {
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