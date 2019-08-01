class Solution {
    public int firstUIniqChar(String s) {
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < arr.length; i++){
            if(!(map.containsKey(arr[i]))) map.putIfAbsent(arr[i],1);
            else map.put(arr[i], map.get(arr[i])+1);
        }
        return 0;
    }
}