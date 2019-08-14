class Solution {
    public int fib(int N) {
        if(N <= 1) return N;
        
        int a = 0, b = 1;
		
		for(int i = 0; i<N-1; i++)
		{
			int sum = a + b;
			a = b;
			b = sum;
		}
        
        return b;
    }
}

class recursiveSolution {
    public int fib(int N) {
        
        if(N <= 1) return N;
        
        int sum = fib(N-1) + fib(N-2);
        
        return sum;
    }
}