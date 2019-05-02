class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows == 0){return ans;}
        List<Integer> previousRow = new ArrayList<>();
        previousRow.add(1);
        ans.add(previousRow);
        if(numRows == 1){return ans;}
        for(int i=0; i<numRows-1; i++){
        
            List<Integer> working = new ArrayList<>();
            working.add(1);
                for(int x=0; x<previousRow.size()-1; x++){
                    working.add(previousRow.get(x)+previousRow.get(x+1));
                }
            working.add(1);
            ans.add(working);
           previousRow = working;
        } 
        return ans;       
    }
}