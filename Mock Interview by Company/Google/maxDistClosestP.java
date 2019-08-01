class Solution {
    public int maxDistToClosest(int[] seats) {
        int space = 0;
        ArrayList<Integer> position = new ArrayList<Integer>();
        for(int i = 0; i<seats.length; i++){
            if(seats[i]==1) position.add(i); 
        }
        int maxDistance = Math.max(position.get(0), position.get((seats.length-1)-          position.get(position.size()-1)));
        for(int i = 0; i<position.size()-1; i++){
            int test = position.get(i+1)-position.get(i); 
            if(test>maxDistance){
                maxDistance = test;
                space = i;
            }
            System.out.println(maxDistance);
        }
        space = maxDistance/2 + space;
        return space;
    }
}