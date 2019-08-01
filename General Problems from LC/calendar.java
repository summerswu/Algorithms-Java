class solution{
	public boolean static lookOverlap(int[][] hours){
		for (int i = 0; i<hours.length-1; i++){
			if(hours[i][0] > hours[i+1]) return false;
		}
		return true;
	}
}

//next step if finding out how to implement an efficient sort on a two d array;