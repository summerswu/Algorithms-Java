class Solution {
    public int integerReplacement(int n) {
        int counter = 0;
        if(n == 0)return counter;
        if(n%2 != 0){n++;counter++;}
        while (n != 1){
            n = n/2;
            counter++;
        }
        return counter;
    }
}