class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        
        double[] arr = new double[queries.size()];
        
        for(int i = 0; i<arr.length; i++) arr[i] = searchWeight(
        queries.get(i).get(0), queries.get(i).get(1), new HashSet<>(), graph);
        
        return arr;
    } 
    
    public double searchWeight(String start, String end,  Set<String> visited, Map<String, Map<String, Double>> graph){
        
        if(!graph.containsKey(end)) return -1;
        if(!graph.containsKey(start)) return -1;
        
        if (graph.get(start).containsKey(end))
            return graph.get(start).get(end);
        
        visited.add(start);
        
        for(Map.Entry<String, Double> neighbour : graph.get(start).entrySet()){
             if (!visited.contains(neighbour.getKey())) {
                double productWeight = searchWeight(neighbour.getKey(), end, visited, graph);
                if (productWeight != -1.0)
                    return neighbour.getValue() * productWeight;
            }  
        }
        return -1;
        
    }
    
    public Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values){
        
        Map<String, Map<String, Double>> graph = new HashMap<>();
        
        String first, second; 
        for(int i = 0; i<equations.size(); i++){
            
            first = equations.get(i).get(0);
            second = equations.get(i).get(1);
            
            graph.putIfAbsent(first, new HashMap<>());
            graph.get(first).put(second, values[i]);
            
            graph.putIfAbsent(second, new HashMap<>());
            graph.get(second).put(first, (1/values[i]));
            
        }
        
        return graph;
    }
}