public int uniqueMorseRepresentations(String[] words) {
		HashSet<String> hashSet = new HashSet<>();
		for (String w : words) {
			hashSet.add(getCode(w));
		}

		return hashSet.size();
	}

	private String getCode(String w) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		for (char c : w.toCharArray()) {
			stringBuilder.append(morseCode[c - 'a']);
		}
		return stringBuilder.toString();
	}