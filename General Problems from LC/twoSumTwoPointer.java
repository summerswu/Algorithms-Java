class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        if(numbers.length == 0){
            return arr;
        }
        for (int i = 0; i < numbers.length; i++){
            int lookup = target - numbers[i];
            int global = i;
            System.out.println("looking for " + lookup);
            if(i != 0 && numbers[i] != numbers[i-1]){
                for(int x = global+1; x < numbers.length; x++){
                    System.out.println("found " + numbers[x] + "at" + global + x);
                    if(lookup == numbers[x]){
                        arr[0]=global+1;
                        arr[1]=x+1;
                        break;
                    }
                }
            }
             if(i == 0){
                for(int x = global+1; x < numbers.length; x++){
                    System.out.println("found " + numbers[x] + "at" + global + x);
                    if(lookup == numbers[x]){
                        arr[0]=global+1;
                        arr[1]=x+1;
                        break;
                    }
                }
            }
            if(arr[1] != 0){
                break;
            }
        }
        
        return arr;
    }
}