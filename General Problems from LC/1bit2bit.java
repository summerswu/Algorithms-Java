class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        int size = bits.length;
        if(size == 1)return true;
        
        int counter = 0;
        while(counter <= size-2 && bits[size-2-counter] != 0){
            counter++;
        }
        
        System.out.println(counter);
        
        if(counter%2 == 0) return true;
        else return false;
        
    }
}