class solution{
	public int findMaxSlice(String s){
		int curr = 0;
		int max  = 0;

		HashMap<Character, Integer> occurenceMap = new HashMap<Chracter,Integer>();
		HashMap<Character, Integer> left = new HashMap<Chracter,Integer>();
		HashMap<Character, Integer> repeat = new HashMap<Chracter,Integer>();

		for(int i = 0; i<s; i++){
			if(occurenceMap.containsKey(s.charAt(i))){
				occurenceMap.put(s.charAt(i), occurenceMap.get(s.charAt(i))+1);
			}
			occurenceMap.putIfAbsent(s.charAt(i), 1);
		}

		for(int i = 0; i<s; i++){

			occurenceMap.put(s.charAt(i), occurenceMap.get(s.charAt(i))-1);
			if(left.containsKey(s.charAt(i))){
				left.put(s.charAt(i), left.get(s.charAt(i))+1);
			}
			left.putIfAbsent(s.charAt(i), 1);

			if(repeat.containsKey(s.charAt(i))) curr -= repeat.get(s.charAt(i));

			repeat.put(s.charAt(i), Math.min(left.get(s.charAt(i)), occurenceMap.get(s.charAt(i))));

			curr += repeat.get(s.charAt(i));

			max = (max<curr)? curr : max;
		} 

		return max;

	}
}