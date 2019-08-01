class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();//special cases
        int size = matrix.length*matrix[0].length;//finding size of entire matrix
        int i = 0;//number of rows 
        int j = 0;//number of columns
        int rowCounter = 0; //which layer is this?
        if (matrix.length == 0)
        {return ans;}
        if(matrix[0].length==0){return ans;}
        
        for(int k=0; k < size; k++){

            ans.add(matrix[i][j]);
            //looping through the matrix and setting thing item as 
            if(i==0+rowCounter && j != matrix[0].length - rowCounter-1){
                j++;
                continue;
            }
            if(j==(matrix[0].length - rowCounter-1) && i != (matrix.length - rowCounter-1)){
                i++;
                
                continue;
            }
            
            if(i==(matrix.length-rowCounter-1) && j != (0 + rowCounter)){
                j--;
                
                continue;
            }
            
            if(j==(0 + rowCounter) && ((i-1) !=0 + rowCounter)){
                i--;
                continue;
            }
            
            else if((i-1) == 0 + rowCounter && j==(0 +rowCounter)){
              
                rowCounter ++;
                j = j + 1;
                continue;
            }
            
            
            
        }
       
        return ans;
        
    }
}