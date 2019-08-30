class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new LinkedList<>();
        
        if(numRows > 0) arr.add(Arrays.asList(1));
        if(numRows > 1) arr.add(Arrays.asList(1, 1));
        s
        for(int layerIndex = 3; layerIndex <= numRows ; layerIndex ++){
            System.out.println(layerIndex);
            List<Integer> layer = new LinkedList<>();
            layer.add(1);
            
            for(int j = 0; j<layerIndex-2; j++){
                 layer.add(arr.get(layerIndex-2).get(j) + arr.get(layerIndex-2).get(j+1));
            }
            
            layer.add(1);
            arr.add(layer);
        }
        
        return arr;
    }
}