public class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\W+");
        int i = 0;
        int j = arr.length - 1;
        String answer = "";
        String space = " "; 
        
        while (i < j){
            String first = arr[i];
            String second = arr[j];
            arr[j] = first;
            arr[i] = second;
            i++;
            j--;
        }
        
       for (int z = 0; z < arr.length; z++){
           
           if(arr.length == 1) {
               answer += arr[z];
           }
           else if(z != arr.length-1){
                answer += arr[z];
                answer += space;
               }
           else{
                answer += arr[z];
           }
       }
        
        return answer;
    }
}