class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        
        int fX = 0;
        int fY = 1;
        int sX = 2;
        int sY = 3;
                
        if(rec1[fX] >= rec2[sX]) return false;
        if(rec1[fY] >= rec2[sY]) return false;
        if(rec1[sX] <= rec2[fX]) return false;
        if(rec1[sY] <= rec2[fY]) return false;
        
        return true;
        
    }
}