class Solution {
    public int totalFruit(int[] tree) {
        if(tree.length == 0) return 0;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int maxFruit = 0;
        int laggingPointer = 0;
        
        ArrayList<Integer> currArr = new ArrayList<Integer>();
        
        for(int i = 0; i<tree.length;i++){
            
            if(currArr.size()<2 && !map.containsKey(tree[i])){
                currArr.add(tree[i]);
            }
            
            map.put(tree[i],i);
            
            if(map.size() > 2){
                if(tree[i-1] == currArr.get(1)){
                    laggingPointer = map.get(currArr.get(0))+1;
                }
                else {
                    laggingPointer = map.get(currArr.get(1))+1;
                }
        
                map.clear();
                map.put(tree[i-1], i-1);
                map.put(tree[i],i);
                
                currArr.clear();
                currArr.add(tree[i]);
                currArr.add(tree[i-1]);
            }
            
            maxFruit = Math.max(i-laggingPointer, maxFruit);
            
        }
        
        return maxFruit + 1;
    }
}