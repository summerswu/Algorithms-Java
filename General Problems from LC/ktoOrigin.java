class Solution {
    public int[][] kClosest(int[][] points, int K) {
        
        HashMap<Double, ArrayList<Integer>> map = new HashMap<Double, ArrayList<Integer>>();
        
        double[] distance = new double[points.length];
        int[][] arr = new int[K][2];
        
        for(int i = 0; i<points.length; i++){
            
            double distanceCurr = (double)Math.sqrt(points[i][1]*points[i][1] + points[i][0]*points[i][0]);
            distance[i] = distanceCurr;
            
            ArrayList<Integer> coordinates = new ArrayList<Integer>();
            
            coordinates.add(points[i][0]);
            coordinates.add(points[i][1]);
            
            map.put(distanceCurr, coordinates);                                             
        }
        
        Arrays.sort(distance);
        
        for(double dis:distance) System.out.println("This is the distance" + dis);
        
        for(int i = 0; i < K ; i++){
            arr[i][0] = map.get(distance[i]).get(0);
            arr[i][1] = map.get(distance[i]).get(1);
        }
        
        return arr;
    }
}