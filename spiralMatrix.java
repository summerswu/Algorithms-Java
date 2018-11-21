class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();//special cases
        int size = matrix.length*matrix[0].length;//finding size of entire matrix
        int i = 0;//number of rows 
        int j = 0;//number of columns
        int rowCounter = 0; //which layer is this?
        for(int k=0; k < size; k++){
            i = i+rowCounter;
            j = j+rowCounter;
            ans.add(matrix[i][j]);
            //looping through the matrix and setting thing item as 
            if(i==0+rowCounter && j != matrix[0].length - rowCounter){
                j++;
            }
            if(j==(matrix[0].length - rowCounter) && i != (matrix.length - rowCounter)){
                i++;
            }
            
            if(i==(matrix.length-rowCounter) && j != (0 - rowCounter)){
                j--;
            }
            
            if(j==(0 +rowCounter) && (i !=0 + rowCounter)){
                i--;
            }
            
            else if((i --) == 0 + rowCounter && j==(0 +rowCounter)){
                rowCounter ++;
            }
            
        }
        
        return ans;
    }
}