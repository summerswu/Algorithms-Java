class Solution{
public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> stack = new Stack<>();//initiate a stack 
    int[] ret = new int[temperatures.length];//initiate the answer array
    for(int i = 0; i < temperatures.length; i++) {//loop throught the entire length of the array
        while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
            //while stack is is not empty and the current temperature is larger the the temperature on the top of the stack
            System.out.println("The current Temperature is: " + temperatures[i]);
            int idx = stack.pop();//integer idx is equal to the top of the stock
            System.out.println("");
            ret[idx] = i - idx;//answer at idx is equal to i minus idx
        }
        stack.push(i);//add i to the stack
    }
    return ret;
}
    
}