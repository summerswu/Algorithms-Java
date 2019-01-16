class Solution {
    public int minSubArrayLen(int s, int[] a) {
      if (a == null || a.length == 0)
      {return 0;}

      int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

      while (j < a.length) {// looping through the array
        sum += a[j];// adding the current item to sum
        j++;
        while (sum >= s) {
          min = Math.min(min, j - i);//is j-i smaller than current min? 
          sum -= a[i];//minus from the other end
          i++;
        }
      }

      return min == Integer.MAX_VALUE ? 0 : min;
    }
}