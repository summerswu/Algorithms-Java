class FreqStack {
    
    HashMap<Integer, Integer> frequency;
    HashMap<Integer, Stack<Integer>> mapGroup;

    int max;    
    
    public FreqStack() {
        frequency = new HashMap();
        mapGroup = new HashMap();
        max = 0;
    }
    
    public void push(int x) {
        int f = frequency.getOrDefault(x, 0)+1;
        frequency.put(x,f);
        //construction of the frequency hashtable
        if (f>max)
            max = f;//keeping track of the max value
        
        mapGroup.computeIfAbsent(f, z-> new Stack()).push(x);
    }
    
    public int pop() {
        int popped = mapGroup.get(max).pop();//using the number to get the current highest frequency
        //pop the stack of that highest frequency
        frequency.put(popped, frequency.get(popped)-1);//reduce the frequency map of that element
        if(mapGroup.get(max).size()==0)
            max--;//if max of that stack after pop is zero, reduce max by one
        return popped;
    }   
    
}