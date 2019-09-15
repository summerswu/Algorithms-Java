class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int cost = 0;
        int[][] plaaceHolder = costs;
        Arrays.sort(costs, (a,b) -> ((a[0] - a[1]) - (b[0] - b[1])));
        int n = 0;
        for(int[] arr : costs){
            if(n < costs.length/2) cost += arr[0];
            else cost += arr[1];
            n++;
        }
        return cost;
    }
}