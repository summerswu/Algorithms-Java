class Solution {
    public int[][] merge(int[][] intervals) {
        java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return Double.compare(a[0], b[0]);
            }
        });
        
        ArrayList<int[]> arr = new ArrayList<int[]>(); 
        
        for(int i = 0; i < intervals.length; i++){
            
            int start = intervals[i][0];
            int end = intervals[i][1];
                
            while(i < intervals.length-1 && end >= intervals[i+1][0]){
                i++;
                end = Math.max(intervals[i][1], end);
            }
            
            if(arr.size() > 0 && arr.get(arr.size()-1)[1] >= end) continue;
            
            int[] currinterval = {start, end};
            arr.add(currinterval);
        }
        
        int[][] ans = new int[arr.size()][2]; 
        
        int i = 0;
        
        for(int[] interval : arr){
            ans[i] = interval;
            i++;
        }
        
        return ans;
    }
}