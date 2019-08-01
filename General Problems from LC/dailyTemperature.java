class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];//create a new array for the answer
        
        for(int i = 0; i<ans.length; i++){//return the extreme cases 
            ans[i] = whenWarmer(i, T);
        }
        
        return ans;
    }
    
    public int whenWarmer(int i, int[] T){
        int days = 0;//initiate a days value c
        int currentTemp = T[i];

        while(currentTemp >= T[i]){
          if(i==T.length-1) return 0;
          i++;
          days++;
          System.out.println(days);
        }
        
        return days;//while the index is smaller then array size and while, increase the index increase the day value
    }
}