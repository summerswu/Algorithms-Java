class Solution {
    public int romanToInt(String s) {
        char[] val = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        //loop through the entire char array
        //this is largest to smallest
        
        int arr = 0;
        
        for(int i = val.length-1; i > -1; i--){
            if( i-1 >= 0 && map.get(val[i-1]) < map.get(val[i])){
                arr += map.get(val[i])-map.get(val[i-1]);
                i--;
            } else {
                arr += map.get(val[i]);
            }
        }
        
        return arr;
    }
}