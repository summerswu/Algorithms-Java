
class Solution{

  public List<Integer> smallestTwo(int[] arr){
    
    List<Integer> ans = new ArrayList<Integer>();
    
	 	if(arr.length < 2) return ans;//looking out for edge case where arr size is smaller then two
    
    int smallest = 0;
    int secondSmallest = 1;
    
    if(arr[secondSmallest] < arr[smallest]){
      smallest = 1;
      secondSamllest = 0;
    }
    
    for(int i = 0; i<arr.length; i ++){
    	if(arr[i] < arr[smallest]){
        arr[secondSmallest] = smallest;
        smallest = arr[i];
      } else if (arr[i] < secondSmallest){
        secondSmallest = arr[i];
      }
    }
    
    ans.add(smallest);
    ans.add(secondSmallest);
    
    return ans;
    
  }
  
}

#Given an array of integers write a function that returns the indices of the two smallest integers in the array.