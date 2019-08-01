class Solution {
    
    boolean Rotation = true;
    boolean Change = false;
    
    public int rotatedDigits(int N) {
        int count = 0;
        
        for(int i = 1; i <= N; i++){
            int placeholder = i;
            
            while( placeholder > 0 ){
                int input = placeholder % 10;
                System.out.println(input);
                canRotate(input);
                canChange(input);
                placeholder = placeholder/10;
            }
            
            if(Rotation && Change) count++; 
            Rotation = true;
            Change = false;
        }
        
        return count;
    }
    public void canRotate(int input){
        if(input == 3 || input ==4 || input == 7) Rotation = false;
    }
    
    public void canChange(int input){
        if (input == 2 || input ==5 || input == 6 || input == 9) Change = true;
    }
}